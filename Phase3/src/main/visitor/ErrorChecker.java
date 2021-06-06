package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListType;
import main.ast.types.single.BoolType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.compileErrors.typeErrors.CantUseValueOfVoidFunction;
import main.compileErrors.typeErrors.ConditionNotBool;
import main.compileErrors.typeErrors.ReturnValueNotMatchFunctionReturnType;
import main.compileErrors.typeErrors.UnsupportedTypeForPrint;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;
import java.util.*;
import main.visitor.*;

public class ErrorChecker extends Visitor<Void> {

    public Map<String, Boolean> visited = new HashMap<>();
    private final ErrorInference errorInference = new ErrorInference(this);

    @Override
    public Void visit(Program program) {
        program.getMain().accept(this);
        visited.clear();
        errorInference.visited.clear();
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {

        if (visited.containsKey(funcDeclaration.getFunctionName().getName()))
            return null;

        visited.put(funcDeclaration.getFunctionName().getName(), true);

        // System.out.println("ErrorChecker: Visiting funcDec " + funcDeclaration.getFunctionName().getName());
        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + funcDeclaration.getFunctionName().getName());
        } catch (ItemNotFoundException ignore) {}

        SymbolTable.push(fsti.getFunctionSymbolTable());


        SymbolTable.top.scope = funcDeclaration.getFunctionName().getName();

//        if (fsti.getReturnType() == null) //second visit
        fsti.getFuncDeclaration().getBody().accept(this);


//        System.out.println(funcDeclaration.getFunctionName().getName());
//        System.out.println(fsti.getArgTypes().toString());
//        System.out.println(fsti.getReturnType());

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        mainDeclaration.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement statement: blockStmt.getStatements())
            statement.accept(this);

        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type type = conditionalStmt.getCondition().accept(errorInference);
        if (!(type instanceof BoolType))
            if (!(type instanceof NoType))
                conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));

        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);

        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCallStmt) {
        funcCallStmt.getFunctionCall().accept(errorInference);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        Type type = print.getArg().accept(errorInference);
        if (print.getArg() instanceof FunctionCall && type instanceof VoidType) {
            print.addError(new CantUseValueOfVoidFunction(print.getLine()));
            type = new NoType();
        }
        if (!(type instanceof IntType) && !(type instanceof BoolType) && !(type instanceof StringType) && !(type instanceof ListType))
            if (!(type instanceof NoType))
                print.addError(new UnsupportedTypeForPrint(print.getLine()));
        return null;
    }

    public boolean voidOnFuncCall(Expression expr, Type exprRet) {
        return expr instanceof FunctionCall && exprRet instanceof VoidType;
    }

    public boolean checkTypesRecursive(Type a, Type b) {
        if (a == null && b == null)
            return true;
        if (a == null || b == null)
            return false;

        if (a instanceof NoType || b instanceof NoType)
            return true;

        if (a instanceof ListType && b instanceof ListType)
            return checkTypesRecursive(((ListType) a).getType(), ((ListType) b).getType());

        return a.getClass().equals(b.getClass());
    }

    public boolean compareFptr(FptrType a, FptrType b) {
        var fa = new FunctionSymbolTableItem();
        var fb = new FunctionSymbolTableItem();

        try {
            fa = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + a.getFunctionName());
            fb = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + b.getFunctionName());
        } catch (ItemNotFoundException ignore) {} // This should never happen

        if (fa.getArgTypes().size() != fb.getArgTypes().size()) {
            return false;
        }
        if (!checkTypesRecursive(fa.getReturnType(), fb.getReturnType())) {
            return false;
        }
        for (int i = 0; i < fa.getArgTypes().size(); i++) {
            if (!checkTypesRecursive(fa.getArgTypes().get(i), fb.getArgTypes().get(i)))
                return false;
        }

        return true;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type returnType = returnStmt.getReturnedExpr().accept(errorInference);

        if (voidOnFuncCall(returnStmt.getReturnedExpr(), returnType)) {
            returnStmt.addError(new CantUseValueOfVoidFunction(returnStmt.getLine()));
            return null;
        }

        //if (returnType instanceof VoidType) //khode kalemeye void mitoone baashe
        //    returnStmt.addError(new CantUseValueOfVoidFunction(returnStmt.getLine()));

        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + SymbolTable.top.scope);

            if (fsti.getReturnType() == null) {//not set til now
                fsti.setReturnType(returnType);
                return null;
            }
            else
            {
                if (fsti.getReturnType() instanceof NoType || fsti.getReturnType() == null) {
                    fsti.setReturnType(returnType);
                    return null;
                }
            }
            if (returnType != null) {
                if (fsti.getReturnType().getClass().equals((returnType.getClass()))) {
                    if (fsti.getReturnType() instanceof FptrType && returnType instanceof FptrType)
                        if (!compareFptr((FptrType) fsti.getReturnType(), (FptrType) returnType)) {
                            returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                            return null;
                        }
                    if (!checkTypesRecursive(fsti.getReturnType(), returnType)) {
                        returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                        return null;
                    }
                }

                if (!(fsti.getReturnType().getClass().equals(returnType.getClass()))) {
                    if (!(returnType instanceof NoType)) {
                        returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                    }
                }
            }
        } catch (ItemNotFoundException ignore) {}

        return null;
    }
}

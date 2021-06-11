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
import main.compileErrors.typeErrors.CantUseValueOfVoidFunction;
import main.compileErrors.typeErrors.ConditionNotBool;
import main.compileErrors.typeErrors.ReturnValueNotMatchFunctionReturnType;
import main.compileErrors.typeErrors.UnsupportedTypeForPrint;
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.*;
import java.util.*;

public class TypeSetter  extends Visitor<Void> {

    public Map<String, Boolean> visited = new HashMap<>();
    private final TypeInference typeInference = new TypeInference(this);

    @Override
    public Void visit(Program program) {
        //System.out.println("First visit");
        program.getMain().accept(this);

        visited.clear();
        typeInference.visited.clear();

        System.out.println("Second visit");
        program.getMain().accept(this);

        for (FunctionDeclaration functionDeclaration: program.getFunctions())
        {
            String functionName = functionDeclaration.getFunctionName().getName();
            if (visited.containsKey(functionName))
            {
                var fsti = new FunctionSymbolTableItem();
                try {
                    fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + functionName);
                    if (fsti.getReturnType() == null)
                        fsti.setReturnType(new NoType());
                } catch (ItemNotFoundException ignore) {}

                System.out.println(functionName);
                System.out.println(fsti.getArgTypes().toString());
                System.out.println(fsti.getReturnType());
            }
        }

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        if (visited.containsKey(funcDeclaration.getFunctionName().getName()))
            return null;

        visited.put(funcDeclaration.getFunctionName().getName(), true);

        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + funcDeclaration.getFunctionName().getName());
        } catch (ItemNotFoundException ignore) {}

        SymbolTable.push(fsti.getFunctionSymbolTable());
        SymbolTable.top.scope = funcDeclaration.getFunctionName().getName();
        fsti.getFuncDeclaration().getBody().accept(this);
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
        conditionalStmt.getCondition().accept(typeInference);
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);

        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCallStmt) {
        funcCallStmt.getFunctionCall().accept(typeInference);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        print.getArg().accept(typeInference);
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
        Type returnType = returnStmt.getReturnedExpr().accept(typeInference);

        if (voidOnFuncCall(returnStmt.getReturnedExpr(), returnType)) {
            // returnStmt.addError(new CantUseValueOfVoidFunction(returnStmt.getLine()));
            return null;
        }

        //if (returnType instanceof VoidType) //khode kalemeye void mitoone baashe
        //    returnStmt.addError(new CantUseValueOfVoidFunction(returnStmt.getLine()));

        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + SymbolTable.top.scope);
            System.out.println("Function " + SymbolTable.top.scope + " line " + returnStmt.getLine()
                    + " current return type: " + fsti.getReturnType());
            if (fsti.getReturnType() instanceof ListType)
                System.out.println("--listType " + ((ListType) fsti.getReturnType()).getType());
            if (fsti.getReturnType() == null) {//not set til now
                //System.out.println("Function " + SymbolTable.top.scope + ": Set on line " + returnStmt.getLine() + " " + returnType);
                fsti.setReturnType(returnType);
                if (returnType instanceof ListType)
                    //System.out.println("--listType " + ((ListType) fsti.getReturnType()).getType());
                if (returnType instanceof ListType)
                    //System.out.println("--actual listType " + ((ListType) returnType).getType());
                return null;
            }
            else
            {
                if (fsti.getReturnType() instanceof NoType || fsti.getReturnType() == null) {
                    fsti.setReturnType(returnType);
                    //System.out.println("Function " + SymbolTable.top.scope + "Set on line " + returnStmt.getLine()
                            //+ " " + fsti.getReturnType());
                    //System.out.println("--actual listType " + ((ListType) returnType).getType());
                    return null;
                }
            }
            if (returnType != null) {
                if (fsti.getReturnType().getClass().equals((returnType.getClass()))) {
                    if (fsti.getReturnType() instanceof FptrType && returnType instanceof FptrType)
                        if (!compareFptr((FptrType) fsti.getReturnType(), (FptrType) returnType)) {
                            // returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                            return null;
                        }
                    if (!checkTypesRecursive(fsti.getReturnType(), returnType)) {
                        //System.out.println("Function " + SymbolTable.top.scope + ": Oops on line " + returnStmt.getLine() + " "
                                //+ ((ListType)fsti.getReturnType()).getType() + " " + ((ListType)returnType).getType());
                        // returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                        return null;
                    }
                }

                if (!(fsti.getReturnType().getClass().equals(returnType.getClass()))) {
                    if (!(returnType instanceof NoType)) {
                        // returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
                    }
                }
            }
        } catch (ItemNotFoundException ignore) {}

        return null;
    }
}

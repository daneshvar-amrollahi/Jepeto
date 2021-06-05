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
        //System.out.println("First visit");
        program.getMain().accept(this);

        visited.clear();
        errorInference.visited.clear();

        //System.out.println("Second visit");
        //program.getMain().accept(this);

        /*for (FunctionDeclaration functionDeclaration: program.getFunctions())
        {
            String functionName = functionDeclaration.getFunctionName().getName();
            if (visited.containsKey(functionName))
            {
                var fsti = new FunctionSymbolTableItem();
                try {
                    fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + functionName);
                } catch (ItemNotFoundException ignore) {}

                System.out.println(functionName);
                System.out.println(fsti.getArgTypes().toString());
                System.out.println(fsti.getReturnType());
            }
        }*/

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

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type returnType = returnStmt.getReturnedExpr().accept(errorInference);

        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + SymbolTable.top.scope);

            if (fsti.getReturnType() == null) //not set til now
                fsti.setReturnType(returnType);
            else
            {
                if (fsti.getReturnType() instanceof NoType || fsti.getReturnType() == null)
                    fsti.setReturnType(returnType);
            }
            if (returnType != null)
                if (!(fsti.getReturnType().getClass().equals(returnType.getClass())))
                    if (!(returnType instanceof NoType))
                        returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));

        } catch (ItemNotFoundException ignore) {}


        return null;
    }
}

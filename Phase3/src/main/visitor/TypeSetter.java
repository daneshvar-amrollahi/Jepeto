package main.visitor;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.single.BoolType;
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

        //System.out.println("Second visit");
        program.getMain().accept(this);

        for (FunctionDeclaration functionDeclaration: program.getFunctions())
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

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type returnType = returnStmt.getReturnedExpr().accept(typeInference);

        /*System.out.println("Scope is " + SymbolTable.top.scope);
        for (Map.Entry<String, SymbolTableItem> pair : SymbolTable.top.items.entrySet())
        {
            System.out.println(pair.getKey().toString());
            System.out.println(pair.getValue().getName());
        }
        */


        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + SymbolTable.top.scope);

            if (fsti.getReturnType() == null)
                fsti.setReturnType(returnType);
            else
            {
                if (fsti.getReturnType() instanceof NoType)
                    fsti.setReturnType(returnType);
            }


        } catch (ItemNotFoundException ignore) {}


        //System.out.println(SymbolTable.top.items.toString());
        return null;
    }
}

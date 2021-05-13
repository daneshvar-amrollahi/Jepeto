package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.VoidValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.compileErrors.CompileError;
import main.compileErrors.nameErrors.DuplicateFunction;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.FunctionSymbolTableItem;

import java.util.ArrayList;
import java.util.Map;


public class NameAnalyzer extends Visitor<Void> {
    boolean hasError = false;

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();

        for (FunctionDeclaration funcDec : program.getFunctions()) {
            FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(funcDec);
            try {
                SymbolTable.root.put(functionSymbolTableItem);
                continue;
            } catch (ItemAlreadyExistsException itemAlreadyExistsException) {
                // DuplicateFunction duplicateFunction;
                // duplicateFunction = new DuplicateFunction(funcDec.getLine(),
                        // funcDec.getFunctionName().getName());

                // System.out.println(duplicateFunction.getMessage());
                // hasError = true;
            }

            String oldFunctionNameString = funcDec.getFunctionName().getName();
            for (int i = 1; i < 1000; ++i) {
                String newFunctionNameString = oldFunctionNameString + "@" + String.valueOf(i);
                funcDec.setFunctionName(new Identifier(newFunctionNameString));
                FunctionSymbolTableItem changedFuncSymTabItem = new FunctionSymbolTableItem(funcDec);
                try {
                    SymbolTable.root.put(changedFuncSymTabItem);
                    break;
                } catch (ItemAlreadyExistsException ignored) {}
            }
        }

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        System.out.println("NameAnalyzer: Arrived at function " + funcDeclaration.getFunctionName().getName());
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        //ToDo
        return null;
    }


    @Override
    public Void visit(BlockStmt blockStmt) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCallStmt) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(AnonymousFunction anonymousFunction) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(FunctionCall funcCall) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        //ToDo
        return null;
    }

    @Override
    public Void visit(VoidValue voidValue) {
        //ToDo
        return null;
    }
}

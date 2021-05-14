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
import main.compileErrors.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;

import java.util.ArrayList;
import main.symbolTable.items.*;
import main.symbolTable.SymbolTable.*;
import java.util.HashMap;
import java.util.Map;


public class NameAnalyzer extends Visitor<Void> {
    boolean hasError = false;

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();

        ArrayList<Boolean> addedToRoot = new ArrayList<Boolean>();
        // first trying to add all possible functions to root
        for (FunctionDeclaration funcDec : program.getFunctions()) {
            FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(funcDec);

            SymbolTable symbolTable = new SymbolTable();
            ArrayList<Identifier> args = funcDec.getArgs();
            for (int i = 0 ; i < args.size() ; i++)
            {
                Identifier curId = args.get(i);
                VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(curId);
                try {
                    symbolTable.put(variableSymbolTableItem);
                } catch (ItemAlreadyExistsException ignore)
                {

                }

            }

            functionSymbolTableItem.setFunctionSymbolTable(symbolTable);

            try {
                SymbolTable.root.put(functionSymbolTableItem);
                addedToRoot.add(true);
            } catch (ItemAlreadyExistsException itemAlreadyExistsException) {
                addedToRoot.add(false);
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
        }
        //f,g,h,f --> f,g,h,f@1 (included in SymbolTable.root)


        for (FunctionDeclaration funcDec : program.getFunctions()) //f,g,h,f@1
        {
            //FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(funcDec);
            //functionSymbolTableItem.setFunctionSymbolTable(SymbolTable.root);
            //stack.push(SymbolTable.root);

            String funcNameString = funcDec.getFunctionName().getName();
            if (funcNameString.indexOf('@') == -1) { //wasn't duplicate
                funcDec.accept(this);
            }
            else{ //duplicate
                String newName = funcDec.getFunctionName().getName();
                newName = newName.substring(0, newName.indexOf('@'));
                DuplicateFunction ex;
                ex = new DuplicateFunction(funcDec.getLine(), newName);
                System.out.println(ex.getMessage());
                funcDec.accept(this);
            }

        }

        return null;
    }



    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {

        SymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(funcDeclaration);

        try {
            functionSymbolTableItem = SymbolTable.root.getItem("Function_" + funcDeclaration.getFunctionName().getName());
        }
        catch (ItemNotFoundException ignore) {} //we know it won't happen

        FunctionDeclaration funcDec = ((FunctionSymbolTableItem)(functionSymbolTableItem)).getFuncDeclaration();

        SymbolTable.push( ((FunctionSymbolTableItem)(functionSymbolTableItem)).getFunctionSymbolTable() );

        ArrayList<Identifier> args = funcDec.getArgs();

        SymbolTable symbolTable = new SymbolTable();
        for (int i = 0 ; i < args.size() ; i++)
        {
            Identifier curId = args.get(i);
            VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(curId);
            try {
                symbolTable.put(variableSymbolTableItem);
            } catch (ItemAlreadyExistsException ex)
            {
                DuplicateArgument duplicateArgument;
                duplicateArgument = new DuplicateArgument(curId.getLine(), curId.getName());
                System.out.println(duplicateArgument.getMessage());
            }

            try {
                SymbolTable.root.getItem("Function_" + curId.getName());
                NameConflict nameConflict;
                nameConflict = new NameConflict(curId.getLine(), curId.getName());
                System.out.println(nameConflict.getMessage());
            } catch(ItemNotFoundException ignore) { }

        }

        funcDec.getBody().accept(this);

        /*(FunctionSymbolTableItem functionSymbolTableItem = new FunctionSymbolTableItem(funcDeclaration); This part worked
        SymbolTable symbolTable = new SymbolTable();
        ArrayList<Identifier> args = funcDeclaration.getArgs();
        for (int i = 0 ;i < args.size() ; i++)
        {
            Identifier curId = args.get(i);
            VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(curId);
            try {
                symbolTable.put(variableSymbolTableItem);
            } catch (ItemAlreadyExistsException ex)
            {
                DuplicateArgument duplicateArgument;
                duplicateArgument = new DuplicateArgument(curId.getLine(), curId.getName());
                System.out.println(duplicateArgument.getMessage());
            }

            try {
                SymbolTable.root.getItem("Function_" + curId.getName());
                NameConflict nameConflict;
                nameConflict = new NameConflict(curId.getLine(), curId.getName());
                System.out.println(nameConflict.getMessage());
            } catch(ItemNotFoundException ignore)
            {

            }

        }

        //functionSymbolTableItem.setFunctionSymbolTable(symbolTable);

        funcDeclaration.getBody().accept(this);
        */

        //System.out.println("NameAnalyzer: Arrived at function " + funcDeclaration.getFunctionName().getName());
        //ArrayList<Identifier> args = funcDeclaration.getArgs();
        //a,b,b,a,c,a,d
        /*
        for (int i = 0 ; i < args.size() ; i++)
        {
            Identifier id1 = args.get(i);
            //System.out.println(id1.getName());
            boolean found = false;
            for (int j = i + 1 ; j < args.size() ; j++)
            {
                Identifier id2 = args.get(j);
                //System.out.println(id2.getName());
                if (id1.getName().equals(id2.getName())) {
                    //System.out.println("WTF?");
                    found = true;
                    break;
                }
            }
            //System.out.println();
            if (found)
            {
                DuplicateArgument ex;
                ex = new DuplicateArgument(id1.getLine(), id1.getName());
                System.out.println(ex.getMessage());
            }
        }

        //Name of arg conflicts with function

        //visit body
        */
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        //ToDo
        return null;
    }


    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement stmt : blockStmt.getStatements())
            stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        if (conditionalStmt.getCondition() != null)
            conditionalStmt.getCondition().accept(this);

        if (conditionalStmt.getThenBody() != null)
            conditionalStmt.getThenBody().accept(this);

        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);

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
        if (returnStmt.getReturnedExpr() != null)
            returnStmt.getReturnedExpr().accept(this);
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

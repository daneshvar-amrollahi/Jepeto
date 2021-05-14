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
import java.util.*;


public class NameAnalyzer extends Visitor<Void> {
    public boolean hasError = false;
    public static  Stack<SymbolTable> naStack = new Stack<>();
    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        // first trying to add all possible functions to root
        for (FunctionDeclaration funcDec : program.getFunctions()) {
            FunctionSymbolTableItem fsti = new FunctionSymbolTableItem(funcDec);

            SymbolTable funcSymTab = new SymbolTable();
            ArrayList<Identifier> args = funcDec.getArgs();
            for (int i = 0 ; i < args.size() ; i++) {
                Identifier curId = args.get(i);
                VariableSymbolTableItem vsti = new VariableSymbolTableItem(curId);
                try {
                    funcSymTab.put(vsti);
                } catch (ItemAlreadyExistsException ignore) {}
            }

            fsti.setFunctionSymbolTable(funcSymTab);

            try {
                SymbolTable.root.put(fsti);
            } catch (ItemAlreadyExistsException itemAlreadyExistsException) {
                String oldFuncName = funcDec.getFunctionName().getName();
                for (int i = 1; i < 1000; i++) {
                    String newFuncName = oldFuncName + "@" + String.valueOf(i);
                    try {
                        funcDec.setFunctionName(new Identifier(newFuncName));
                        FunctionSymbolTableItem newFsti = new FunctionSymbolTableItem(funcDec);
                        newFsti.setFunctionSymbolTable(funcSymTab);
                        SymbolTable.root.put(newFsti);
                        break;
                    } catch (ItemAlreadyExistsException ignored) {}
                }
            }
        }
        //f,g,h,f --> f,g,h,f@1 (included in SymbolTable.root)

        for (FunctionDeclaration funcDec : program.getFunctions()) { //f,g,h,f@1
            String funcName = funcDec.getFunctionName().getName();
            if (funcName.indexOf('@') != -1) { // duplicate
                String newName = funcDec.getFunctionName().getName();
                newName = newName.substring(0, newName.indexOf('@'));
                DuplicateFunction ex;
                ex = new DuplicateFunction(funcDec.getLine(), newName);
                System.out.println(ex.getMessage());
            }
            funcDec.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        // System.out.println("Arrived at function " + funcDeclaration.getFunctionName().getName());
        SymbolTableItem fsti = new FunctionSymbolTableItem(funcDeclaration);
        try {
            fsti = SymbolTable.root.getItem("Function_" + funcDeclaration.getFunctionName().getName());
        }
        catch (ItemNotFoundException ex) {
            // System.out.println("Which function? you joking? " + funcDeclaration.getFunctionName().getName());
            System.exit(1);
        } // we know it won't happen

        FunctionDeclaration funcDec = funcDeclaration;
        naStack.push( ((FunctionSymbolTableItem)(fsti)).getFunctionSymbolTable() );

        ArrayList<Identifier> args = funcDec.getArgs();
        SymbolTable symbolTable = new SymbolTable();
        for (int i = 0 ; i < args.size() ; i++) {
            Identifier curId = args.get(i);
            VariableSymbolTableItem vsti = new VariableSymbolTableItem(curId);
            try {
                symbolTable.put(vsti);
            } catch (ItemAlreadyExistsException ex) {
                DuplicateArgument duplicateArgument;
                duplicateArgument = new DuplicateArgument(curId.getLine(), curId.getName());
                System.out.println(duplicateArgument.getMessage());
            }

            try {
                SymbolTable.root.getItem("Function_" + curId.getName());
                NameConflict nameConflict;
                nameConflict = new NameConflict(curId.getLine(), curId.getName());
                System.out.println(nameConflict.getMessage());
            } catch (ItemNotFoundException ignore) {}
        }

        funcDec.getBody().accept(this);
        naStack.pop();
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
//        System.out.println("Arrived at Identifier " + identifier.getName());
        boolean flag1 = false, flag2 = false;
        if (naStack.peek() == null)
            System.exit(1);
        try {
            naStack.peek().getItem("Var_" + identifier.getName());
        } catch (ItemNotFoundException ex) {
            flag1 = true;
        }

        try {
            SymbolTable.root.getItem("Function_" + identifier.getName());
        } catch (ItemNotFoundException ex) {
            flag2 = true;
        }

        if (flag1 && flag2) {
            VariableNotDeclared vnd;
            vnd = new VariableNotDeclared(identifier.getLine(), identifier.getName());
            System.out.println(vnd.getMessage());
        }

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
        Expression funcInst = funcCall.getInstance();
        // System.out.println("func inst is: " + funcInst.toString());
        if (funcInst.toString().contains("Identifier_")) {
            String funcName = ((Identifier) funcInst).getName();
            try {
                SymbolTable.root.getItem("Function_" + funcName);
            } catch (ItemNotFoundException ex) {
                FunctionNotDeclared fnd;
                fnd = new FunctionNotDeclared(funcInst.getLine(), funcName);
                System.out.println(fnd.getMessage());
            }
        }
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

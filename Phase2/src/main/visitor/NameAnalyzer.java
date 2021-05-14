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
import main.compileErrors.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;

import java.util.ArrayList;
import main.symbolTable.items.*;
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
            for (Identifier curId : args) {
                VariableSymbolTableItem vsti = new VariableSymbolTableItem(curId);
                try {
                    funcSymTab.put(vsti);
                } catch (ItemAlreadyExistsException ignore) {
                }
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

        program.getMain().accept(this);
        //f,g,h,f --> f,g,h,f@1 (included in SymbolTable.root)

        for (FunctionDeclaration funcDec : program.getFunctions()) { //f,g,h,f@1
            String funcName = funcDec.getFunctionName().getName();
            if (funcName.indexOf('@') != -1) { // duplicate
                String newName = funcDec.getFunctionName().getName();
                newName = newName.substring(0, newName.indexOf('@'));
                DuplicateFunction ex;
                ex = new DuplicateFunction(funcDec.getLine(), newName);
                System.out.println(ex.getMessage());
                hasError = true;
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
            System.exit(2);
        } // we know it won't happen

        FunctionDeclaration funcDec = funcDeclaration;
        naStack.push( ((FunctionSymbolTableItem)(fsti)).getFunctionSymbolTable() );

        ArrayList<Identifier> args = funcDec.getArgs();
        SymbolTable symbolTable = new SymbolTable();
        for (Identifier curId : args) {
            VariableSymbolTableItem vsti = new VariableSymbolTableItem(curId);
            try {
                symbolTable.put(vsti);
            } catch (ItemAlreadyExistsException ex) {
                DuplicateArgument duplicateArgument;
                duplicateArgument = new DuplicateArgument(curId.getLine(), curId.getName());
                System.out.println(duplicateArgument.getMessage());
                hasError = true;
            }

            try {
                SymbolTable.root.getItem("Function_" + curId.getName());
                NameConflict nameConflict;
                nameConflict = new NameConflict(curId.getLine(), curId.getName());
                System.out.println(nameConflict.getMessage());
                hasError = true;
            } catch (ItemNotFoundException ignore) {
            }
        }

        funcDec.getBody().accept(this);
        naStack.pop();
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        if (mainDeclaration.getBody() != null)
            mainDeclaration.getBody().accept(this); //not sure
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
        if (funcCallStmt.getFunctionCall() != null)
            funcCallStmt.getFunctionCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        if (print.getArg() != null)
            print.getArg().accept(this);
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
        if (binaryExpression.getBinaryOperator() != null)
            binaryExpression.getFirstOperand().accept(this);

        if (binaryExpression.getSecondOperand() != null)
            binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        if (unaryExpression.getOperand() != null)
            unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(AnonymousFunction anonymousFunction) {
        SymbolTable symbolTable = new SymbolTable();
        symbolTable.items = new HashMap<>(naStack.peek().items);


        for (Identifier arg : anonymousFunction.getArgs()) {

            String idName = arg.getName();

            try {
                SymbolTable.root.getItem("Function_" + idName);

                NameConflict nameConflict;
                nameConflict = new NameConflict(arg.getLine(), arg.getName());
                System.out.println(nameConflict.getMessage());
                hasError = true;

            } catch(ItemNotFoundException ex) {
                VariableSymbolTableItem vsti = new VariableSymbolTableItem(arg);
                symbolTable.items.put(vsti.getKey(), vsti);
            }


        }

        naStack.push(symbolTable);

        if (anonymousFunction.getBody() != null)
            anonymousFunction.getBody().accept(this);

        naStack.pop();
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
//        System.out.println("Arrived at Identifier " + identifier.getName());
        boolean flag1 = false, flag2 = false;
        if (naStack.peek() == null)
            System.exit(2);
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
            hasError = true;
        }

        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        if (listAccessByIndex.getInstance() != null)
            listAccessByIndex.getInstance().accept(this);

        if (listAccessByIndex.getIndex() != null)
            listAccessByIndex.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {

        if (listSize.getInstance() != null)
            listSize.getInstance().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCall funcCall) {
        Expression funcInst = funcCall.getInstance();
        boolean isIdentifier = false;
        // System.out.println("func inst is: " + funcInst.toString());
        if (funcInst.toString().contains("Identifier_")) {
            String funcName = ((Identifier) funcInst).getName();
            try {
                SymbolTable.root.getItem("Function_" + funcName);
                isIdentifier = true;
            } catch (ItemNotFoundException ex) {
                FunctionNotDeclared fnd;
                fnd = new FunctionNotDeclared(funcInst.getLine(), funcName);
                System.out.println(fnd.getMessage());
                hasError = true;
            }
        }

        FunctionSymbolTableItem fsti = new FunctionSymbolTableItem();
        if (isIdentifier && funcCall.getArgsWithKey().size() > 0) {
            String funcName = ((Identifier) funcInst).getName();
            try {
                fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + funcName);
            } catch (ItemNotFoundException ex) {
                System.exit(2);
            }

            // System.out.println("argsMap size is: " + funcCall.getArgsWithKey().size());
            for (Map.Entry<Identifier, Expression> pair : funcCall.getArgsWithKey().entrySet()) {
                // System.out.println("inside for");
                Identifier id = pair.getKey();
                // System.out.println("id.getName() = " + id.getName());
                try {
                    SymbolTableItem sti = fsti.getFunctionSymbolTable().getItem("Var_" + id.getName());
                } catch (ItemNotFoundException ex) {
                    ArgumentNotDeclared and;
                    and = new ArgumentNotDeclared(id.getLine(), id.getName(), funcName);
                    System.out.println(and.getMessage());
                    hasError = true;
                }

                pair.getValue().accept(this);
            }
        }

        if (!funcCall.getInstance().toString().contains("Identifier_"))
            funcCall.getInstance().accept(this);

        if (funcCall.getArgs() != null)
            for (Expression e : funcCall.getArgs())
                e.accept(this);
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        for (Expression exp : listValue.getElements())
            exp.accept(this);
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {

        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {

        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {

        return null;
    }

    @Override
    public Void visit(VoidValue voidValue) {

        return null;
    }
}

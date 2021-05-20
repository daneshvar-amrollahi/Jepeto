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
import java.util.Map;


public class ASTTreePrinter extends Visitor<Void> {

    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
       messagePrinter(program.getLine(), program.toString());

       program.getMain().accept(this);

       for (FunctionDeclaration functionDeclaration : program.getFunctions())
           functionDeclaration.accept(this);

       return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        messagePrinter(funcDeclaration.getLine(), funcDeclaration.toString());

        if (funcDeclaration.getFunctionName() != null)
            funcDeclaration.getFunctionName().accept(this);

        for (Identifier arg : funcDeclaration.getArgs())
            arg.accept(this);

        if (funcDeclaration.getBody() != null)
            funcDeclaration.getBody().accept(this);

        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        messagePrinter(mainDeclaration.getLine(), mainDeclaration.toString());
        if (mainDeclaration.getBody() != null)
            mainDeclaration.getBody().accept(this); //not sure
        return null;
    }


    @Override
    public Void visit(BlockStmt blockStmt) {
        messagePrinter(blockStmt.getLine(), blockStmt.toString());

        for (Statement stmt : blockStmt.getStatements())
            stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        messagePrinter(conditionalStmt.getLine(), conditionalStmt.toString());

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
        messagePrinter(funcCallStmt.getLine(), funcCallStmt.toString());

        if (funcCallStmt.getFunctionCall() != null)
            funcCallStmt.getFunctionCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        messagePrinter(print.getLine(), print.toString());

        if (print.getArg() != null)
            print.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        messagePrinter(returnStmt.getLine(), returnStmt.toString());

        if (returnStmt.getReturnedExpr() != null)
            returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());

        if (binaryExpression.getBinaryOperator() != null)
            binaryExpression.getFirstOperand().accept(this);

        if (binaryExpression.getSecondOperand() != null)
            binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        /*if (unaryExpression.getOperator() != null)
            unaryExpression.getOperator().accept(this); //problem here?
        */

        if (unaryExpression.getOperand() != null)
            unaryExpression.getOperand().accept(this);

        return null;
    }

    @Override
    public Void visit(AnonymousFunction anonymousFunction) {
        messagePrinter(anonymousFunction.getLine(), anonymousFunction.toString());

        for (Identifier arg : anonymousFunction.getArgs())
            arg.accept(this);

        if (anonymousFunction.getBody() != null)
            anonymousFunction.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        messagePrinter(identifier.getLine(), identifier.toString());

        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        messagePrinter(listAccessByIndex.getLine(), listAccessByIndex.toString());

        if (listAccessByIndex.getInstance() != null)
            listAccessByIndex.getInstance().accept(this);

        if (listAccessByIndex.getIndex() != null)
            listAccessByIndex.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(ListSize listSize) {
        messagePrinter(listSize.getLine(), listSize.toString());

        if (listSize.getInstance() != null)
            listSize.getInstance().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCall funcCall) {
        System.out.println("A function call");
        messagePrinter(funcCall.getLine(), funcCall.toString());

        if (funcCall.getInstance() != null)
            funcCall.getInstance().accept(this);

        for (Expression arg : funcCall.getArgs())
            arg.accept(this);

        for (Map.Entry<Identifier, Expression> entry : funcCall.getArgsWithKey().entrySet())
        {
            entry.getKey().accept(this);
            entry.getValue().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        messagePrinter(listValue.getLine(), listValue.toString());

        for (Expression exp : listValue.getElements())
            exp.accept(this);
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        messagePrinter(intValue.getLine(), intValue.toString());

        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        messagePrinter(boolValue.getLine(), boolValue.toString());

        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        messagePrinter(stringValue.getLine(), stringValue.toString());

        return null;
    }

    @Override
    public Void visit(VoidValue voidValue) {
        messagePrinter(voidValue.getLine(), voidValue.toString());

        return null;
    }

}

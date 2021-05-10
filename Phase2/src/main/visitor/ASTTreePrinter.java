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


public class ASTTreePrinter extends Visitor<Void> {

    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
       //ToDo
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        //ToDo
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

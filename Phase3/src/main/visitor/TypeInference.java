package main.visitor;

import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.types.*;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListType;
import main.ast.types.single.*;
import main.compileErrors.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import java.util.*;

public class TypeInference extends Visitor<Type> {
    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Expression left = binaryExpression.getFirstOperand();
        Expression right = binaryExpression.getSecondOperand();

        Type tl = left.accept(this);
        Type tr = right.accept(this);
        BinaryOperator operator =  binaryExpression.getBinaryOperator();


        if (operator.equals(BinaryOperator.and) || operator.equals(BinaryOperator.or)){
            if (tl instanceof BoolType && tr instanceof BoolType)
                return new BoolType();

            if ((tl instanceof NoType || tl instanceof BoolType) && (tr instanceof BoolType || tr instanceof NoType))
                return new NoType();
        }
        //TODO
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        //TODO
        return null;
    }

    @Override
    public Type visit(AnonymousFunction anonymousFunction) {
        //TODO
        return null;
    }

    @Override
    public Type visit(Identifier identifier) {
        //TODO
        return null;
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        //TODO
        return null;
    }

    @Override
    public Type visit(ListSize listSize) {
        //TODO
        return null;
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        //TODO
        return null;
    }

    @Override
    public Type visit(ListValue listValue) {
        //TODO
        return null;
    }

    @Override
    public Type visit(IntValue intValue) {
        //TODO
        return null;
    }

    @Override
    public Type visit(BoolValue boolValue) {
        //TODO
        return null;
    }

    @Override
    public Type visit(StringValue stringValue) {
        //TODO
        return null;
    }

    @Override
    public Type visit(VoidValue voidValue) {
        //TODO
        return null;
    }
}

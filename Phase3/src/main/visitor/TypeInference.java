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

        if (operator.equals(BinaryOperator.mult)
                || operator.equals(BinaryOperator.add)
                || operator.equals(BinaryOperator.sub)
                || operator.equals(BinaryOperator.div))
        {
            if (tl instanceof IntType && tr instanceof IntType)
                return new IntType();
            if ((tl instanceof NoType || tl instanceof IntType) && (tr instanceof BoolType || tr instanceof IntType))
                return new NoType();
        }

        if (operator.equals(BinaryOperator.gt)
                || operator.equals(BinaryOperator.lt))
        {
            if (tl instanceof IntType && tr instanceof IntType)
                return new BoolType();
            if ((tl instanceof NoType || tl instanceof IntType) && (tr instanceof BoolType || tr instanceof IntType))
                return new NoType();
        }
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
        funcCall.getInstance().accept(this);

        for (Expression expression: funcCall.getArgs())
            expression.accept(this);

        for (Map.Entry<Identifier, Expression> pair : funcCall.getArgsWithKey().entrySet())
        {
            Expression expression = pair.getValue();
            expression.accept(this);
        }
        return null;
    }

    @Override
    public Type visit(ListValue listValue) { // [[1, 2], ["a", "b"]] error?
        if (listValue.getElements().size() == 0)
            return new ListType(null);

        Type type = listValue.getElements().get(0).accept(this);
        NoType noType = new NoType();
        if (type.getClass().equals(noType.getClass()))
            return new ListType(noType);

        boolean error = false;
        for (int i = 1 ; i < listValue.getElements().size() ; i++)
        {
            Expression expression = listValue.getElements().get(i);
            Type curType = expression.accept(this);
            if (type.getClass().equals(curType.getClass()))
                error = true;
        }

        if (!error)
            return new ListType(type);
        else
            return new ListType(noType);

    }

    @Override
    public Type visit(IntValue intValue) {
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        return new BoolType();
    }

    @Override
    public Type visit(StringValue stringValue) {
        return new StringType();
    }

    @Override
    public Type visit(VoidValue voidValue) {
        return new VoidType();
    }
}

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
    private final TypeSetter typeSetter;

    public Map<String, Boolean> visited = new HashMap<>();

    public TypeInference(TypeSetter typeSetter) {
        this.typeSetter = typeSetter;
    };

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

        if (operator.equals(BinaryOperator.append)) {
            //System.out.println("Append " + binaryExpression.getLine() + " " + tl + " " + ((ListType)tl).getType() + " , " + tr);

            if (!(tl instanceof ListType)) {
                return new NoType();
            }

            if (((ListType) tl).getType() instanceof NoType) {
                ((ListType) tl).setType(tr);
                return tl;
            }

            if (((ListType) tl).getType().getClass().equals(tr.getClass())) {
                //System.out.println("Are you there?");
                return tl;
            }
            return new NoType(); //We doubt this
        }

        if (operator.equals(BinaryOperator.eq) || operator.equals(BinaryOperator.neq))
        {
            if (tl instanceof NoType || tr instanceof NoType)
                return new NoType();

            if (tl == null || tr == null)
                return new NoType();

            if (tl instanceof ListType || tr instanceof ListType)
                return new NoType();

            if (tl.getClass().equals(tr.getClass()))
                return new BoolType();

            if (tl instanceof FptrType && tr instanceof VoidType)
                return new BoolType();

            if (tr instanceof FptrType && tl instanceof VoidType)
                return new BoolType();

            return new NoType();
        }

        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        Expression expression = unaryExpression.getOperand();
        UnaryOperator operator = unaryExpression.getOperator();
        Type expressionType = expression.accept(this);

        if (operator.equals(UnaryOperator.minus) && (expressionType instanceof IntType))
            return new IntType();

        if (operator.equals(UnaryOperator.not) && (expressionType instanceof BoolType))
            return new BoolType();

        return new NoType();
    }

    @Override
    public Type visit(AnonymousFunction anonymousFunction) {
        try {
            FunctionSymbolTableItem afsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + anonymousFunction.getName());

        }
        catch (ItemNotFoundException ignore) {}


        return new FptrType(anonymousFunction.getName());
    }

    @Override
    public Type visit(Identifier identifier) {
        try{
            VariableSymbolTableItem vsti = (VariableSymbolTableItem) SymbolTable.top.getItem("Var_" + identifier.getName());
            return vsti.getType();
        }
        catch (ItemNotFoundException ignore) {}

        try {

            FunctionSymbolTableItem fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + identifier.getName());
            //fsti.getFuncDeclaration().accept(typeSetter);
            return new FptrType(identifier.getName());
        }
        catch (ItemNotFoundException ignore) {}

        return null;
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        Expression instanceExpr = listAccessByIndex.getInstance();
        Expression indexExpr = listAccessByIndex.getIndex();

        Type instanceType = instanceExpr.accept(this);
        Type indexType = indexExpr.accept(this);

        if ((indexType instanceof IntType) && (instanceType instanceof ListType))
            return ((ListType) instanceType).getType();

        return new NoType();
    }

    @Override
    public Type visit(ListSize listSize) {
        Expression expression = listSize.getInstance();
        Type type = expression.accept(this);

        if (type instanceof ListType)
            return new IntType();

        return new NoType();
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        funcCall.getInstance().accept(this);

        ArrayList<Type> typeArray = new ArrayList<>();
        for (Expression expression: funcCall.getArgs())
        {
            Type type = expression.accept(this);
            typeArray.add(type);
        }

        Map<String, Type> typeMap = new HashMap<>();
        for (Map.Entry<Identifier, Expression> pair : funcCall.getArgsWithKey().entrySet())
        {
            Expression expression = pair.getValue();
            Type type = expression.accept(this);
            typeMap.put(pair.getKey().getName(), type);
        }
        // This should be handled later

        //System.out.println("Instance is " + funcCall.getInstance());

        String functionName = null;

        if (!(funcCall.getInstance() instanceof Identifier))
        {
            Type type = funcCall.getInstance().accept(this);
            if (!(type instanceof FptrType))
                return new NoType();

            try {
                var fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + ((FptrType) type).getFunctionName());


                functionName = fsti.getFuncDeclaration().getFunctionName().getName(); //to be accepted below

            } catch (ItemNotFoundException ignore) {}
        }
        else {
            Identifier instance = (Identifier) funcCall.getInstance();
            Type instanceType = instance.accept(this);
            if (instanceType instanceof FptrType)
                functionName = ((FptrType) instanceType).getFunctionName();
        }

        if (functionName == null)
            return new NoType();

        if (visited.containsKey(functionName))
        {
            var fsti = new FunctionSymbolTableItem();
            try
            {
                fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + functionName);
                return fsti.getReturnType();
                // should also check for argument types
            } catch (ItemNotFoundException ignore) {}
        }

        visited.put(functionName, true);

        var fsti = new FunctionSymbolTableItem();
        try
        {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + functionName);
            fsti.getArgTypes().clear();
        }
        catch (ItemNotFoundException ignore) {}

        var funcArgs = fsti.getFuncDeclaration().getArgs();
        for (int i = 0; i < typeArray.size(); i++)
        {
            //System.out.println("first for " + functionName);
            fsti.addArgType(typeArray.get(i));
            VariableSymbolTableItem varItem;
            try {
                varItem = (VariableSymbolTableItem) fsti.getFunctionSymbolTable().getItem("Var_" + funcArgs.get(i).getName());
                varItem.setType(typeArray.get(i));
            } catch (ItemNotFoundException ignore) {}
        }

        if (!typeMap.isEmpty())
        {
            for (int i = 0; i < funcArgs.size(); i++)
            {
                //System.out.println("second for " + functionName);
                Type type = typeMap.get(funcArgs.get(i).getName());
                fsti.addArgType(type);
                VariableSymbolTableItem varItem;
                try {
                    varItem = (VariableSymbolTableItem) fsti.getFunctionSymbolTable().getItem("Var_" + funcArgs.get(i).getName());
                    varItem.setType(type);
                } catch (ItemNotFoundException ignore) {}
            }
        }
        fsti.getFuncDeclaration().accept(typeSetter);
        //System.out.println("funcCall should return something");
        return fsti.getReturnType();
    }

    @Override
    public Type visit(ListValue listValue) { // [[1, 2], ["a", "b"]] error?
        if (listValue.getElements().size() == 0)
            return new ListType(new NoType()); //as Nazanin said

        boolean found = false;
        Type foundNonNoType = new NoType(); //didn't mean to set this to NoType()
        for (int i = 0 ; i < listValue.getElements().size() ; i++)
        {
            Expression expression = listValue.getElements().get(i);
            Type curType = expression.accept(this);
            if (!(curType instanceof NoType) && !found)
            {
                found = true;
                foundNonNoType = curType;
            }
        }

        if (!found)
            return new ListType(new NoType());
        else
            return new ListType(foundNonNoType);


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

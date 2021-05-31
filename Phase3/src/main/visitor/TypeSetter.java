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

    private final TypeInference typeInference = new TypeInference(this);

    @Override
    public Void visit(Program program) {
        program.getMain().accept(this);

        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        var fsti = new FunctionSymbolTableItem();
        try {
            fsti = (FunctionSymbolTableItem) SymbolTable.root.getItem("Function_" + funcDeclaration.getFunctionName());
        } catch (ItemNotFoundException ignore) {}

        SymbolTable.push(fsti.getFunctionSymbolTable());
//        fsti.getFuncDeclaration().getBody().accept(this);
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
        returnStmt.getReturnedExpr().accept(typeInference);
        return null;
    }
}

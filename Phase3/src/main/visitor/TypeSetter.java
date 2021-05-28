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
    @Override
    public Void visit(Program program) {
        //TODO
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration funcDeclaration) {
        //TODO
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDeclaration) {
        //TODO
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //TODO
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //TODO
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt funcCallStmt) {
        //TODO
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        //TODO
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //TODO
        return null;
    }
}

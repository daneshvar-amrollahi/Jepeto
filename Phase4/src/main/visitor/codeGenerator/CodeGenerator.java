package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.*;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.functionPointer.*;
import main.ast.types.list.*;
import main.ast.types.single.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;

import javax.swing.plaf.nimbus.State;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final ExpressionTypeChecker expressionTypeChecker;
    private FunctionDeclaration curFuncDec;
    private Set<String> visited;
    private int labelIndex;
    private boolean isMain;
    public CodeGenerator(ExpressionTypeChecker expressionTypeChecker, Set<String> visited) {
        this.expressionTypeChecker = expressionTypeChecker;
        outputPath = "./output/";
        this.visited = visited;
        labelIndex = 0;
        isMain = false;
        prepareOutputFolder();
    }

    private int getFresh()
    {
        return labelIndex++;
    }

    private void prepareOutputFolder() {
        String jasminPath = "Utilities/jarFiles/jasmin.jar";
        String listClassPath = "Utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "Utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
             directory.mkdir();
        }
        catch(SecurityException ignored) {}
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException ignored) {}
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException ignored) {}
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        String command = """
                .method public <init>()V
                .limit stack 140
                .limit locals 140
                aload_0
                invokespecial java/lang/Object/<init>()V
                return
                .end method
                """;

        addCommand(command);
    }

    private int slotOf(String identifier) {

        return 0;
    }

    public void addMainDeclaration()
    {
        String command = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(command);
    }

    public void addMainInstance()
    {
        String command = """
                new Main
                dup
                invokespecial Main/<init>()V
                """;

        addCommand(command);

    }

    @Override
    public String visit(Program program) {
        addMainDeclaration();
        addStaticMainMethod();
        addMainInstance();

        String mainDec = program.getMain().accept(this);
        addCommand(mainDec);

        for (FunctionDeclaration funcDec: program.getFunctions())
//            if (visited.contains(funcDec.getFunctionName().getName()))
                addCommand(funcDec.accept(this));
        return null;
    }

    public FunctionSymbolTableItem getFuncSymbolTableItem(String key) {
        try {
            return (FunctionSymbolTableItem) SymbolTable.root.getItem(key);
        } catch (ItemNotFoundException ignored) {}
        return null;
    }

    @Override
    public String visit(FunctionDeclaration funcDeclaration) {
        //.method public f(IZ)I
        String funcName = funcDeclaration.getFunctionName().getName();

        String command = "";
        command += ".method public " + funcName;

        FunctionSymbolTableItem fsti = getFuncSymbolTableItem("Function_" + funcName);
        expressionTypeChecker.setCurFunction(fsti);

        Map<String, Type> argTypeMap = fsti.getArgTypes();
        Type returnType = fsti.getReturnType();
        ArrayList<Type> argTypes = new ArrayList<>();
        for (Identifier identifier: funcDeclaration.getArgs()) {
            String argName = identifier.getName();
            Type t = argTypeMap.get(argName);
            argTypes.add(t);
        }

        StringBuilder argList = new StringBuilder("(");
        for (Type t : argTypes) {
            argList.append(getArgTypeSymbol(t));
        }
        argList.append(")");
        argList.append(getArgTypeSymbol(returnType));
        command += argList.toString() + "\n";

        command += ".limit stack 140\n";
        command += ".limit locals 140\n";

        command += funcDeclaration.getBody().accept(this);
        command += ".end method\n";
        return command;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        isMain = true;
        String command = """
                .method public static main([Ljava/lang/String;)V
                  .limit stack 140
                  .limit locals 140
                """;

        command += mainDeclaration.getBody().accept(this);

        command += """
                  return
                .end method
                """;
        isMain = false;
        return command;
    }


    @Override
    public String visit(BlockStmt blockStmt) {
        StringBuilder command = new StringBuilder();
        for (Statement stmt : blockStmt.getStatements())
            command.append(stmt.accept(this)).append('\n');
        return command.toString();
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(FunctionCallStmt funcCallStmt) {
        String command = "";
        expressionTypeChecker.setFunctioncallStmt(true);
        command += funcCallStmt.getFunctionCall().accept(this);

        Type t = funcCallStmt.getFunctionCall().accept(expressionTypeChecker);
        if (!(t instanceof VoidType))
            command += "pop\n";

        expressionTypeChecker.setFunctioncallStmt(false);
        return command;
    }

    public String getArgTypeSymbol(Type t) {
        if (t instanceof IntType)
            return "Ljava/lang/Integer;";
        if (t instanceof StringType)
            return "Ljava/lang/String;";
        if (t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        if (t instanceof ListType)
            return "LList;";
        if (t instanceof FptrType)
            return "LFptr;";
        if (t instanceof VoidType)
            return "V";
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        String command = "";
        command += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";

        Type t = print.getArg().accept(expressionTypeChecker);
        command += print.getArg().accept(this);
        command += "invokevirtual java/io/PrintStream/println(Ljava/lang/Object;)V\n";

        return command;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        String command = "";
        command += returnStmt.getReturnedExpr().accept(this);
        Type returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if (returnType instanceof VoidType)
            command += "return\n";
        else
            command += "areturn\n";
        return command;
    }

    public String getOperationCommand(BinaryOperator bo) {
        if (bo.equals(BinaryOperator.add))
            return "iadd\n";
        if (bo.equals(BinaryOperator.sub))
            return "isub\n";
        if (bo.equals(BinaryOperator.mult))
            return "imul\n";
        if (bo.equals(BinaryOperator.div))
            return "idiv\n";
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        String command = "";
        String commandLeft = binaryExpression.getFirstOperand().accept(this);
        String commandRight = binaryExpression.getSecondOperand().accept(this);
        String operationCommand = "";
        Type tl = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
        Type tr = binaryExpression.getSecondOperand().accept(expressionTypeChecker);
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        if (operator.equals(BinaryOperator.add) ||
            operator.equals(BinaryOperator.sub) ||
            operator.equals(BinaryOperator.mult) ||
            operator.equals(BinaryOperator.div)) {
            command += commandLeft;
            command += "invokevirtual java/lang/Integer/intValue()I\n";
            command += commandRight;
            command += "invokevirtual java/lang/Integer/intValue()I\n";
            command += getOperationCommand(operator);
            command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }

        if (operator.equals(BinaryOperator.and) || operator.equals(BinaryOperator.or)) {
            String elseLabel = "Label" + getFresh();
            String afterLabel = "Label" + getFresh();
            String ifCommand = "";

            command += commandLeft;
            command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";

            if (operator.equals(BinaryOperator.and))
                command += "ifeq " + elseLabel + "\n";
            else
                command += "ifne " + elseLabel + "\n";

            command += commandRight;
            command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
            command += "goto " + afterLabel + "\n";
            command += elseLabel + ":\n";

            command += "iconst_" + (operator.equals(BinaryOperator.or) ? "1" : "0") + "\n";

            command += afterLabel + ":\n";
            command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }

        if (operator.equals(BinaryOperator.lt) || operator.equals(BinaryOperator.gt))
        {
            String elseLabel = "Label" + getFresh();
            String afterLabel = "Label" + getFresh();
            String ifCommand = "";


            command += commandLeft;
            command += "invokevirtual java/lang/Integer/intValue()I\n";
            command += commandRight;
            command += "invokevirtual java/lang/Integer/intValue()I\n";

            if (operator.equals(BinaryOperator.lt))
                ifCommand = "if_icmpge";
            else
                ifCommand = "if_icmple";


            command += ifCommand + " " + elseLabel + "\n";
            command += "iconst_1\n";
            command += "goto " + afterLabel + "\n";
            command += elseLabel + ":\n";
            command += "iconst_0\n";
            command += afterLabel + ":\n";
            command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }

        if (operator.equals(BinaryOperator.eq) || operator.equals(BinaryOperator.neq)) {
            String elseLabel = "Label" + getFresh();
            String afterLabel = "Label" + getFresh();
            String ifCommand = "";

            if (tl instanceof IntType)
            {
                command += commandLeft;
                command += "invokevirtual java/lang/Integer/intValue()I\n";
                command += commandRight;
                command += "invokevirtual java/lang/Integer/intValue()I\n";

                if (operator.equals(BinaryOperator.eq))
                    ifCommand = "if_icmpne";
                else
                    ifCommand = "if_icmpeq";
            }

            if (tl instanceof BoolType)
            {
                command += commandLeft;
                command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
                command += commandRight;
                command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";

                if (operator.equals(BinaryOperator.eq))
                    ifCommand = "if_icmpne";
                else
                    ifCommand = "if_icmpeq";
            }

            if (tl instanceof ListType || tl instanceof FptrType)
            {
                command += commandLeft;
                command += commandRight;

                if (operator.equals(BinaryOperator.eq))
                    ifCommand = "if_acmpne";
                else
                    ifCommand = "if_acmpeq";
            }

            command += ifCommand + " " + elseLabel + "\n";
            command += "iconst_1\n";
            command += "goto " + afterLabel + "\n";
            command += elseLabel + ":\n";
            command += "iconst_0\n";
            command += afterLabel + ":\n";
            command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }

        //TODO: Append
        if (operator.equals(BinaryOperator.append)) {
            command += commandLeft;
            command += "dup\n";
            command += commandRight;
            command += "invokevirtual List/addElement(Ljava/lang/Object;)V\n";
        }
        return command;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        unaryExpression.getOperand().accept(this);
        String operand = unaryExpression.getOperand().accept(this);
        String command = "";
        if (unaryExpression.getOperator().equals(UnaryOperator.not)) { //x xor 1 and 1 = not(x)
            command += operand;
            command += "invokevirtual java/lang/Boolean/booleanValue()Z\n";

            String elseLabel = "Label" + getFresh();
            String afterLabel = "Label" + getFresh();

            command += "ldc 1\n";
            command += "ixor\n";
            command += "ldc 1\n";
            command += "iand\n";
            command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        }
        if (unaryExpression.getOperator().equals(UnaryOperator.minus)) {
            command += operand;
            command += "invokevirtual java/lang/Integer/intValue()I\n";
            command += "ineg\n";
            command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        }
        return command;
    }

    @Override
    public String visit(AnonymousFunction anonymousFunction) {
        //todo
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        FunctionSymbolTableItem fsti = getFuncSymbolTableItem(identifier.getName());
        String command = "";
        if (fsti == null) { //Not a function name
            //TODO
//            int slot = slotOf(identifier);
//            command = "aload " + slot;
        }
        else {
            command += "new Fptr\n" +
                    "dup\n" +
                    (isMain ? "aload_1\n" : "aload_0\n") +
                    "ldc \"" + identifier.getName() + "\"\n" +
                    "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        }
        return command;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex) {
        String commandList = listAccessByIndex.getInstance().accept(this);
        String commandIndex = listAccessByIndex.getIndex().accept(this);

        String command = "";
        command += commandList;
        command += commandIndex;
        command += "invokevirtual java/lang/Integer/intValue()I\n";
        command += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        return command;
    }

    @Override
    public String visit(ListSize listSize) {
        String commandList = listSize.getInstance().accept(this);
        String command = "";
        command += commandList;
        command += "invokevirtual List/getSize()I\n";
        command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        return command;
    }

    @Override
    public String visit(FunctionCall funcCall) {
        ArrayList<String> argByteCodes = new ArrayList<>();
        for (Expression expression : funcCall.getArgs()) {
            argByteCodes.add(expression.accept(this));
        }

        String command = "";
        command += """
                new java/util/ArrayList
                dup
                invokespecial java/util/ArrayList/<init>()V
                """;

        for (String bc: argByteCodes) {
            command += "dup\n";
            command += bc;
            command += "\"invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\\n\"";
        }

        //TODO: getArgs with key

        command += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";
        return command;
    }

    @Override
    public String visit(ListValue listValue) {
        ArrayList<String> listElements = new ArrayList<>();
        StringBuilder command = new StringBuilder();

        command.append("new List\n");
        command.append("dup\n");
        command.append("""
                new java/util/ArrayList
                dup
                invokespecial java/util/ArrayList/<init>()V
                """);

        for (Expression expression: listValue.getElements()) {
            listElements.add(expression.accept(this));
        }

        for (String bc: listElements) {
            command.append("dup\n");
            command.append(bc);
            command.append("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n");
            command.append("pop\n");
        }

        command.append("invokespecial List/<init>(Ljava/util/ArrayList;)V\n");

        return command.toString();
    }

    @Override
    public String visit(IntValue intValue) {
        String command = "";
        command += "ldc " + String.valueOf(intValue.getConstant()) + "\n";
        command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        return command;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String command = "";
        if (boolValue.getConstant())
            command += "ldc 1\n";
        else
            command += "ldc 0\n";
        command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        return command;
    }

    @Override
    public String visit(StringValue stringValue) {
        return "ldc \"" + stringValue.getConstant() + "\"\n";
    }

    @Override
    public String visit(VoidValue voidValue) {
        return "\n";
    }
}

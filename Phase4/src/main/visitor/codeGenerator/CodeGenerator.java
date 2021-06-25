package main.visitor.codeGenerator;

import main.ast.nodes.*;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
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

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final ExpressionTypeChecker expressionTypeChecker;
    private FunctionDeclaration curFuncDec;

    public CodeGenerator(ExpressionTypeChecker expressionTypeChecker) {
        this.expressionTypeChecker = expressionTypeChecker;
        outputPath = "./output/";
        prepareOutputFolder();
    }

    private void prepareOutputFolder() {
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
             directory.mkdir();
        }
        catch(SecurityException e) {//unreachable
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e) {//unreachable
        }
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
        } catch (IOException e) {//never reached
        }
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
        //todo
    }

    private int slotOf(String identifier) {
        //todo
        return 0;
    }

    @Override
    public String visit(Program program) {
        //todo
        return null;
    }

    @Override
        public String visit(FunctionDeclaration funcDeclaration) {
        //todo
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        //todo
        return null;
    }


    @Override
    public String visit(BlockStmt blockStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(FunctionCallStmt funcCallStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        //todo
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        //todo
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        //todo
        return null;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        //todo
        return null;
    }

    @Override
    public String visit(AnonymousFunction anonymousFunction) {
        //todo
        return null;
    }

    @Override
    public String visit(Identifier identifier) {
        //todo
        return null;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex) {
        //todo
        return null;
    }

    @Override
    public String visit(ListSize listSize) {
        //todo
        return null;
    }

    @Override
    public String visit(FunctionCall funcCall) {
        //todo
        return null;
    }

    @Override
    public String visit(ListValue listValue) {
        //todo
        return null;
    }

    @Override
    public String visit(IntValue intValue) {
        //todo
        return null;
    }

    @Override
    public String visit(BoolValue boolValue) {
        //todo
        return null;
    }

    @Override
    public String visit(StringValue stringValue) {
        //todo
        return null;
    }

    @Override
    public String visit(VoidValue voidValue) {
        //todo
        return null;
    }
}

// Generated from /home/daneshvar/Desktop/PLC/Project/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JepetoParser}.
 */
public interface JepetoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JepetoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JepetoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JepetoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JepetoParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JepetoParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JepetoParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JepetoParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(JepetoParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(JepetoParser.ArgListContext ctx);
}
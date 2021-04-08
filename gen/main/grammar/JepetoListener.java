// Generated from /home/mahyar/CAs/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
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
}
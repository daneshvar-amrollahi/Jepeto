// Generated from /home/daneshvar/Desktop/PLC/Project/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JepetoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JepetoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JepetoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JepetoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(JepetoParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JepetoParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(JepetoParser.ArgListContext ctx);
}
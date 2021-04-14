// Generated from /home/mahyar/CAs/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by {@link JepetoParser#funcCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStmt(JepetoParser.FuncCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(JepetoParser.PrintStmtContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link JepetoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JepetoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(JepetoParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(JepetoParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#argDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDec(JepetoParser.ArgDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(JepetoParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(JepetoParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#else_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_(JepetoParser.Else_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JepetoParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(JepetoParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JepetoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JepetoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#orExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(JepetoParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(JepetoParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#isNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotExpression(JepetoParser.IsNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#ltgtExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtgtExpression(JepetoParser.LtgtExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#addSubExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpression(JepetoParser.AddSubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#mulDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpression(JepetoParser.MulDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#tildaNegOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildaNegOperator(JepetoParser.TildaNegOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#concatExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpression(JepetoParser.ConcatExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#subscriptExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptExpression(JepetoParser.SubscriptExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#factor_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_(JepetoParser.Factor_Context ctx);
	/**
	 * Visit a parse tree produced by {@link JepetoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(JepetoParser.PrintContext ctx);
}
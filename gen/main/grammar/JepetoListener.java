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
	 * Enter a parse tree produced by {@link JepetoParser#funcCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallStmt(JepetoParser.FuncCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#funcCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallStmt(JepetoParser.FuncCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(JepetoParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(JepetoParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#anonymousFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionCall(JepetoParser.AnonymousFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#anonymousFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionCall(JepetoParser.AnonymousFunctionCallContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link JepetoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JepetoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JepetoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(JepetoParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(JepetoParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(JepetoParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(JepetoParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(JepetoParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(JepetoParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#argDec}.
	 * @param ctx the parse tree
	 */
	void enterArgDec(JepetoParser.ArgDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#argDec}.
	 * @param ctx the parse tree
	 */
	void exitArgDec(JepetoParser.ArgDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(JepetoParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(JepetoParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(JepetoParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(JepetoParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#else_}.
	 * @param ctx the parse tree
	 */
	void enterElse_(JepetoParser.Else_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#else_}.
	 * @param ctx the parse tree
	 */
	void exitElse_(JepetoParser.Else_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JepetoParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JepetoParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(JepetoParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(JepetoParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JepetoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JepetoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JepetoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JepetoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(JepetoParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(JepetoParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(JepetoParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(JepetoParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#isNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotExpression(JepetoParser.IsNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#isNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotExpression(JepetoParser.IsNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#ltgtExpression}.
	 * @param ctx the parse tree
	 */
	void enterLtgtExpression(JepetoParser.LtgtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#ltgtExpression}.
	 * @param ctx the parse tree
	 */
	void exitLtgtExpression(JepetoParser.LtgtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpression(JepetoParser.AddSubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#addSubExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpression(JepetoParser.AddSubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpression(JepetoParser.MulDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#mulDivExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpression(JepetoParser.MulDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#tildaNegOperator}.
	 * @param ctx the parse tree
	 */
	void enterTildaNegOperator(JepetoParser.TildaNegOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#tildaNegOperator}.
	 * @param ctx the parse tree
	 */
	void exitTildaNegOperator(JepetoParser.TildaNegOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#concatExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpression(JepetoParser.ConcatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#concatExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpression(JepetoParser.ConcatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#subscriptExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpression(JepetoParser.SubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#subscriptExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpression(JepetoParser.SubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#factor_}.
	 * @param ctx the parse tree
	 */
	void enterFactor_(JepetoParser.Factor_Context ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#factor_}.
	 * @param ctx the parse tree
	 */
	void exitFactor_(JepetoParser.Factor_Context ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JepetoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JepetoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JepetoParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(JepetoParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JepetoParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(JepetoParser.ListTypeContext ctx);
}
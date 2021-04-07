// Generated from /home/daneshvar/Desktop/PLC/Project/Phase1/src/main/grammar/Json.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JsonParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(JsonParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePair(JsonParser.KeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(JsonParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JsonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JsonParser.IdentifierContext ctx);
}
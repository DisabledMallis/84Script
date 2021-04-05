// Generated from TiBasic.g4 by ANTLR 4.9.1

package com.efscript.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TiBasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TiBasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(TiBasicParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(TiBasicParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#disp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisp(TiBasicParser.DispContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(TiBasicParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#store}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore(TiBasicParser.StoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(TiBasicParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen(TiBasicParser.ThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(TiBasicParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(TiBasicParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(TiBasicParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(TiBasicParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(TiBasicParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon(TiBasicParser.ColonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(TiBasicParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(TiBasicParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod(TiBasicParser.PeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#open_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_bracket(TiBasicParser.Open_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#close_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_bracket(TiBasicParser.Close_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(TiBasicParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TiBasicParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#pi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi(TiBasicParser.PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(TiBasicParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#i}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitI(TiBasicParser.IContext ctx);
	/**
	 * Visit a parse tree produced by {@link TiBasicParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(TiBasicParser.NewlineContext ctx);
}
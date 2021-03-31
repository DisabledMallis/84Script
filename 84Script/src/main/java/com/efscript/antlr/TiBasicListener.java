// Generated from TiBasic.g4 by ANTLR 4.9.1

package com.efscript.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TiBasicParser}.
 */
public interface TiBasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(TiBasicParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(TiBasicParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(TiBasicParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(TiBasicParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#disp}.
	 * @param ctx the parse tree
	 */
	void enterDisp(TiBasicParser.DispContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#disp}.
	 * @param ctx the parse tree
	 */
	void exitDisp(TiBasicParser.DispContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(TiBasicParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(TiBasicParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(TiBasicParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(TiBasicParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(TiBasicParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(TiBasicParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(TiBasicParser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(TiBasicParser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(TiBasicParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(TiBasicParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TiBasicParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TiBasicParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#pi}.
	 * @param ctx the parse tree
	 */
	void enterPi(TiBasicParser.PiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#pi}.
	 * @param ctx the parse tree
	 */
	void exitPi(TiBasicParser.PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(TiBasicParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(TiBasicParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#i}.
	 * @param ctx the parse tree
	 */
	void enterI(TiBasicParser.IContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#i}.
	 * @param ctx the parse tree
	 */
	void exitI(TiBasicParser.IContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(TiBasicParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(TiBasicParser.NewlineContext ctx);
}
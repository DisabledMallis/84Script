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
	 * Enter a parse tree produced by {@link TiBasicParser#store}.
	 * @param ctx the parse tree
	 */
	void enterStore(TiBasicParser.StoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#store}.
	 * @param ctx the parse tree
	 */
	void exitStore(TiBasicParser.StoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(TiBasicParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(TiBasicParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(TiBasicParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(TiBasicParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(TiBasicParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(TiBasicParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(TiBasicParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(TiBasicParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(TiBasicParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(TiBasicParser.SpaceContext ctx);
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
	 * Enter a parse tree produced by {@link TiBasicParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(TiBasicParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(TiBasicParser.SemicolonContext ctx);
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
	 * Enter a parse tree produced by {@link TiBasicParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(TiBasicParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(TiBasicParser.PeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#open_bracket}.
	 * @param ctx the parse tree
	 */
	void enterOpen_bracket(TiBasicParser.Open_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#open_bracket}.
	 * @param ctx the parse tree
	 */
	void exitOpen_bracket(TiBasicParser.Open_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#close_bracket}.
	 * @param ctx the parse tree
	 */
	void enterClose_bracket(TiBasicParser.Close_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#close_bracket}.
	 * @param ctx the parse tree
	 */
	void exitClose_bracket(TiBasicParser.Close_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link TiBasicParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(TiBasicParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TiBasicParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(TiBasicParser.EqualsContext ctx);
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
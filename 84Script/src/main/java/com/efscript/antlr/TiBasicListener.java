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
}
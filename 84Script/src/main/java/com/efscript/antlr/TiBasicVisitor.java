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
}
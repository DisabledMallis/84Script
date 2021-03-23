// Generated from EFScript.g4 by ANTLR 4.9.1

package com.EFScript.Antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EFScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EFScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(EFScriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(EFScriptParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(EFScriptParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EFScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(EFScriptParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#add_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_assign_stmt(EFScriptParser.Add_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#sub_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_assign_stmt(EFScriptParser.Sub_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#mul_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_assign_stmt(EFScriptParser.Mul_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#div_assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_assign_stmt(EFScriptParser.Div_assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#inc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc_stmt(EFScriptParser.Inc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#dec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_stmt(EFScriptParser.Dec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(EFScriptParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(EFScriptParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt(EFScriptParser.Var_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(EFScriptParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EFScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(EFScriptParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#methodcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodcall(EFScriptParser.MethodcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#methodparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodparams(EFScriptParser.MethodparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(EFScriptParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EFScriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(EFScriptParser.IdentifierContext ctx);
}
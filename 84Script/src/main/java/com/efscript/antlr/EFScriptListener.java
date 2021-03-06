// Generated from EFScript.g4 by ANTLR 4.9.1

package com.efscript.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EFScriptParser}.
 */
public interface EFScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(EFScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(EFScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(EFScriptParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(EFScriptParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#meta}.
	 * @param ctx the parse tree
	 */
	void enterMeta(EFScriptParser.MetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#meta}.
	 * @param ctx the parse tree
	 */
	void exitMeta(EFScriptParser.MetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#scriptName}.
	 * @param ctx the parse tree
	 */
	void enterScriptName(EFScriptParser.ScriptNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#scriptName}.
	 * @param ctx the parse tree
	 */
	void exitScriptName(EFScriptParser.ScriptNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(EFScriptParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(EFScriptParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(EFScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(EFScriptParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#func_params}.
	 * @param ctx the parse tree
	 */
	void enterFunc_params(EFScriptParser.Func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#func_params}.
	 * @param ctx the parse tree
	 */
	void exitFunc_params(EFScriptParser.Func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EFScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EFScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(EFScriptParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(EFScriptParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#ti_basic_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTi_basic_stmt(EFScriptParser.Ti_basic_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#ti_basic_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTi_basic_stmt(EFScriptParser.Ti_basic_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(EFScriptParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(EFScriptParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#add_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAdd_assign_stmt(EFScriptParser.Add_assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#add_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAdd_assign_stmt(EFScriptParser.Add_assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#sub_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSub_assign_stmt(EFScriptParser.Sub_assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#sub_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSub_assign_stmt(EFScriptParser.Sub_assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#mul_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMul_assign_stmt(EFScriptParser.Mul_assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#mul_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMul_assign_stmt(EFScriptParser.Mul_assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#div_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDiv_assign_stmt(EFScriptParser.Div_assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#div_assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDiv_assign_stmt(EFScriptParser.Div_assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#inc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInc_stmt(EFScriptParser.Inc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#inc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInc_stmt(EFScriptParser.Inc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#dec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDec_stmt(EFScriptParser.Dec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#dec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDec_stmt(EFScriptParser.Dec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(EFScriptParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(EFScriptParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(EFScriptParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(EFScriptParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_stmt(EFScriptParser.Var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_stmt(EFScriptParser.Var_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(EFScriptParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(EFScriptParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EFScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EFScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(EFScriptParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(EFScriptParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(EFScriptParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#methodcall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(EFScriptParser.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#methodparams}.
	 * @param ctx the parse tree
	 */
	void enterMethodparams(EFScriptParser.MethodparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#methodparams}.
	 * @param ctx the parse tree
	 */
	void exitMethodparams(EFScriptParser.MethodparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EFScriptParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EFScriptParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(EFScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(EFScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EFScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(EFScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EFScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(EFScriptParser.NumberContext ctx);
}
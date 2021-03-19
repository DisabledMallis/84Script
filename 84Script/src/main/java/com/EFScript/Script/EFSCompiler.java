package com.EFScript.Script;

import java.util.ArrayList;
import java.util.HashMap;

import com.EFScript.Logger;
import com.EFScript.Antlr.EFScriptLexer;
import com.EFScript.Antlr.EFScriptListener;
import com.EFScript.Antlr.EFScriptParser;
import com.EFScript.Antlr.EFScriptParser.Add_assign_stmtContext;
import com.EFScript.Antlr.EFScriptParser.Assign_stmtContext;
import com.EFScript.Antlr.EFScriptParser.BoolexprContext;
import com.EFScript.Antlr.EFScriptParser.Dec_stmtContext;
import com.EFScript.Antlr.EFScriptParser.Div_assign_stmtContext;
import com.EFScript.Antlr.EFScriptParser.ExpressionContext;
import com.EFScript.Antlr.EFScriptParser.FunctionContext;
import com.EFScript.Antlr.EFScriptParser.IdentifierContext;
import com.EFScript.Antlr.EFScriptParser.If_stmtContext;
import com.EFScript.Antlr.EFScriptParser.Inc_stmtContext;
import com.EFScript.Antlr.EFScriptParser.MethodcallContext;
import com.EFScript.Antlr.EFScriptParser.MethodparamsContext;
import com.EFScript.Antlr.EFScriptParser.Mul_assign_stmtContext;
import com.EFScript.Antlr.EFScriptParser.Return_stmtContext;
import com.EFScript.Antlr.EFScriptParser.ScriptContext;
import com.EFScript.Antlr.EFScriptParser.StatementContext;
import com.EFScript.Antlr.EFScriptParser.Sub_assign_stmtContext;
import com.EFScript.Antlr.EFScriptParser.ValueContext;
import com.EFScript.Antlr.EFScriptParser.Var_stmtContext;
import com.EFScript.Antlr.EFScriptParser.While_stmtContext;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EFSCompiler implements EFScriptListener
{
	private ArrayList<String> varIdentifiers = new ArrayList<>();

	public EFSCompiler(String code)
	{
		EFScriptLexer lexer = new EFScriptLexer(CharStreams.fromString(code));
		EFScriptParser parser = new EFScriptParser(new CommonTokenStream(lexer));
		ScriptContext context = parser.script();

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, context);

		int varCount = varIdentifiers.size();
		Logger.Log("VarAmt: "+varCount);
	}

	public void addVar(String var)
	{
		for(String ident : varIdentifiers)
		{
			if(var.equals(ident))
			{
				Logger.Log("Identifier "+var+" is already defined!");
			}
		}
		varIdentifiers.add(var);
	}
	public int getVarIndex(String var)
	{
		int current = 0;
		for(String ident : varIdentifiers)
		{
			if(ident.equals(var))
			{
				return current;
			}
			current++;
		}
		return -1;
	}

	public byte[] compile()
	{
		return new byte[0];
	}

	@Override
	public void visitTerminal(TerminalNode node) {
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
	}

	@Override
	public void enterScript(ScriptContext ctx) {
		Logger.Log("Compiling...");
	}

	@Override
	public void exitScript(ScriptContext ctx) {
		Logger.Log("Compiled script!");
	}

	@Override
	public void enterFunction(FunctionContext ctx) {
	}

	@Override
	public void exitFunction(FunctionContext ctx) {
	}

	@Override
	public void enterStatement(StatementContext ctx) {
	}

	@Override
	public void exitStatement(StatementContext ctx) {
	}

	@Override
	public void enterAssign_stmt(Assign_stmtContext ctx) {
	}

	@Override
	public void exitAssign_stmt(Assign_stmtContext ctx) {
	}

	@Override
	public void enterAdd_assign_stmt(Add_assign_stmtContext ctx) {
	}

	@Override
	public void exitAdd_assign_stmt(Add_assign_stmtContext ctx) {
	}

	@Override
	public void enterSub_assign_stmt(Sub_assign_stmtContext ctx) {
	}

	@Override
	public void exitSub_assign_stmt(Sub_assign_stmtContext ctx) {
	}

	@Override
	public void enterMul_assign_stmt(Mul_assign_stmtContext ctx) {
	}

	@Override
	public void exitMul_assign_stmt(Mul_assign_stmtContext ctx) {
	}

	@Override
	public void enterDiv_assign_stmt(Div_assign_stmtContext ctx) {
	}

	@Override
	public void exitDiv_assign_stmt(Div_assign_stmtContext ctx) {
	}

	@Override
	public void enterInc_stmt(Inc_stmtContext ctx) {
	}

	@Override
	public void exitInc_stmt(Inc_stmtContext ctx) {
	}

	@Override
	public void enterDec_stmt(Dec_stmtContext ctx) {
	}

	@Override
	public void exitDec_stmt(Dec_stmtContext ctx) {
	}

	@Override
	public void enterIf_stmt(If_stmtContext ctx) {
	}

	@Override
	public void exitIf_stmt(If_stmtContext ctx) {
	}

	@Override
	public void enterWhile_stmt(While_stmtContext ctx) {
	}

	@Override
	public void exitWhile_stmt(While_stmtContext ctx) {
	}

	@Override
	public void enterVar_stmt(Var_stmtContext ctx) {
		String identifier = ctx.identifier().getText();
		addVar(identifier);
	}

	@Override
	public void exitVar_stmt(Var_stmtContext ctx) {
	}

	@Override
	public void enterReturn_stmt(Return_stmtContext ctx) {
	}

	@Override
	public void exitReturn_stmt(Return_stmtContext ctx) {
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
	}

	@Override
	public void enterBoolexpr(BoolexprContext ctx) {
	}

	@Override
	public void exitBoolexpr(BoolexprContext ctx) {
	}

	@Override
	public void enterMethodcall(MethodcallContext ctx) {
	}

	@Override
	public void exitMethodcall(MethodcallContext ctx) {
	}

	@Override
	public void enterMethodparams(MethodparamsContext ctx) {
	}

	@Override
	public void exitMethodparams(MethodparamsContext ctx) {
	}

	@Override
	public void enterValue(ValueContext ctx) {
	}

	@Override
	public void exitValue(ValueContext ctx) {
	}

	@Override
	public void enterIdentifier(IdentifierContext ctx) {
	}

	@Override
	public void exitIdentifier(IdentifierContext ctx) {
	}
}
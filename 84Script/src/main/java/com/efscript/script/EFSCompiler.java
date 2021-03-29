package com.efscript.script;

import com.efscript.Logger;
import com.efscript.antlr.EFScriptLexer;
import com.efscript.antlr.EFScriptListener;
import com.efscript.antlr.EFScriptParser;
import com.efscript.antlr.EFScriptParser.Add_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.Assign_stmtContext;
import com.efscript.antlr.EFScriptParser.BoolexprContext;
import com.efscript.antlr.EFScriptParser.Dec_stmtContext;
import com.efscript.antlr.EFScriptParser.Div_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.antlr.EFScriptParser.Func_paramsContext;
import com.efscript.antlr.EFScriptParser.FunctionContext;
import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.If_stmtContext;
import com.efscript.antlr.EFScriptParser.Inc_stmtContext;
import com.efscript.antlr.EFScriptParser.MethodcallContext;
import com.efscript.antlr.EFScriptParser.MethodparamsContext;
import com.efscript.antlr.EFScriptParser.Mul_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.NumberContext;
import com.efscript.antlr.EFScriptParser.Return_stmtContext;
import com.efscript.antlr.EFScriptParser.ScriptContext;
import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.antlr.EFScriptParser.Sub_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.ValueContext;
import com.efscript.antlr.EFScriptParser.Var_stmtContext;
import com.efscript.antlr.EFScriptParser.While_stmtContext;
import com.efscript.script.blocks.EFSScriptBlock;
import com.efscript.ti.TiCompiler;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EFSCompiler implements EFScriptListener {
	// Ti-Basic compiler
	private TiCompiler compTokens;

	// Initialize the compiler
	public EFSCompiler(String code) {
		Logger.Log("Parsing script...");
		// Parser & Lexer contexts
		EFScriptLexer lexer = new EFScriptLexer(CharStreams.fromString(code));
		EFScriptParser parser = new EFScriptParser(new CommonTokenStream(lexer));
		// Get the script context
		parsed = parser.script();
		Logger.Log("Script parsed");
	}

	// The func that will compile the script start to finish
	private ScriptContext parsed;

	public byte[] compile() throws Exception {
		Logger.Log("Compiling...");

		if (parsed == null) {
			Logger.Log("You must parse the script first!");
			return null;
		}

		// Create compiler instance
		compTokens = new TiCompiler();

		EFSScriptBlock script = new EFSScriptBlock(parsed);
		compTokens.appendInstruction(script.compile());

		Logger.Log("Compiled!");
		return compTokens.compile();
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
	}

	@Override
	public void exitScript(ScriptContext ctx) {
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

	@Override
	public void enterFunc_params(Func_paramsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitFunc_params(Func_paramsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterNumber(NumberContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitNumber(NumberContext ctx) {
		// TODO Auto-generated method stub

	}
}
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
import com.EFScript.Antlr.EFScriptParser.CodeContext;
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
import com.EFScript.Ti.TiCompiler;
import com.EFScript.Ti.TiDecompiler;
import com.EFScript.Ti.TiToken;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EFSCompiler implements EFScriptListener {
	private TiCompiler compTokens = new TiCompiler();
	private ArrayList<String> varIdentifiers = new ArrayList<>();

	boolean funcDefComplete = false;

	public EFSCompiler(String code) {
		EFScriptLexer lexer = new EFScriptLexer(CharStreams.fromString(code));
		EFScriptParser parser = new EFScriptParser(new CommonTokenStream(lexer));
		ScriptContext context = parser.script();

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, context);

		int varCount = varIdentifiers.size();
		Logger.Log("VarAmt: " + varCount);
	}

	public void addVar(String var) {
		for (String ident : varIdentifiers) {
			if (var.equals(ident)) {
				Logger.Log("Identifier " + var + " is already defined!");
			}
		}
		varIdentifiers.add(var);
	}

	public int getVarIndex(String var) {
		int current = 0;
		for (String ident : varIdentifiers) {
			if (ident.equals(var)) {
				return current;
			}
			current++;
		}
		Logger.Log("Could not find var \"" + var + "\"");
		return -1;
	}

	public byte[] compile() {
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
		//Initialization section
		//Basically just reset the registers
		//(And hope I=0, otherwise the program will be die)
		/*
			If I=0
			Then
			0→G
			0→F
			0→C
			1→I
			End
		*/
		//IF I=0
		//Then
		compTokens.appendInstruction(TiToken.IF);
		compTokens.appendInstruction(TiToken.LETTER_I);
		compTokens.appendInstruction(TiToken.EQUALS);
		compTokens.appendInstruction(TiToken.NUM_0);
		compTokens.appendInstruction(TiToken.NEWLINE);
		compTokens.appendInstruction(TiToken.THEN);
		compTokens.appendInstruction(TiToken.NEWLINE);
		/*
			0→G
			0→F
			0→C
			1→I
		*/
		//0→G
		compTokens.appendInstruction(TiToken.NUM_0);
		compTokens.appendInstruction(TiToken.STORE);
		compTokens.appendInstruction(TiToken.LETTER_G);
		compTokens.appendInstruction(TiToken.NEWLINE);
		//0→F
		compTokens.appendInstruction(TiToken.NUM_0);
		compTokens.appendInstruction(TiToken.STORE);
		compTokens.appendInstruction(TiToken.LETTER_F);
		compTokens.appendInstruction(TiToken.NEWLINE);
		//0→C
		compTokens.appendInstruction(TiToken.NUM_0);
		compTokens.appendInstruction(TiToken.STORE);
		compTokens.appendInstruction(TiToken.LETTER_C);
		compTokens.appendInstruction(TiToken.NEWLINE);
		//1→I
		compTokens.appendInstruction(TiToken.NUM_1);
		compTokens.appendInstruction(TiToken.STORE);
		compTokens.appendInstruction(TiToken.LETTER_I);
		compTokens.appendInstruction(TiToken.NEWLINE);
		//END
		compTokens.appendInstruction(TiToken.END);
		compTokens.appendInstruction(TiToken.NEWLINE);

		//Function table
		/*
			//G determines if a func is called
			If G>0	-|---------------Funcs must be defined at thr top of the script
			Then	-|
			//F is which function
			If F=0
			Then
			//L₂ is the parameter stack
			L₂(1)+L₂(2)→C

			End

			End
		*/

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
		String identifier = ctx.identifier().getText();
		int index = getVarIndex(identifier);
		TiToken listSub = TiToken.getListSubscript(1);
		compTokens.appendInstruction(TiToken.LIST);
		compTokens.appendInstruction(listSub);
		compTokens.appendInstruction(TiToken.OPEN_BRACKET);
		compTokens.appendInstruction(TiToken.getNumber(index));
		compTokens.appendInstruction(TiToken.CLOSE_BRACKET);
		compTokens.appendInstruction(TiToken.ADD);
		compTokens.appendInstruction(TiToken.NUM_1);
		compTokens.appendInstruction(TiToken.STORE);
		compTokens.appendInstruction(TiToken.LIST);
		compTokens.appendInstruction(listSub);
		compTokens.appendInstruction(TiToken.OPEN_BRACKET);
		compTokens.appendInstruction(TiToken.getNumber(index));
		compTokens.appendInstruction(TiToken.CLOSE_BRACKET);
		compTokens.appendInstruction(TiToken.NEWLINE);


		//byte[] compiled = compTokens.compile();
		//TiDecompiler decomp = new TiDecompiler(compiled);
		//Logger.Log(decomp.decompile());
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

	@Override
	public void enterCode(CodeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCode(CodeContext ctx) {
		// TODO Auto-generated method stub
		
	}
}
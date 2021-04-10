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

public class EFSCompiler {
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

	public String getMetaScriptName() {
		return parsed.header().meta().scriptName().identifier().getText();
	}
}
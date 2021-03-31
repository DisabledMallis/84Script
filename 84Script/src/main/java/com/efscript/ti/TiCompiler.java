package com.efscript.ti;

import java.util.ArrayList;

import com.efscript.antlr.EFScriptParser;
import com.efscript.antlr.TiBasicLexer;
import com.efscript.antlr.TiBasicListener;
import com.efscript.antlr.TiBasicParser;

import com.efscript.Logger;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TiCompiler implements TiBasicListener {
	// List for tokens
	ArrayList<TiToken> tokens;

	public TiCompiler() {
		tokens = new ArrayList<>();
	}

	public TiCompiler(String code) {
		this();
		Logger.Log("Reading Ti-Basic code...");

		TiBasicLexer lexer = new TiBasicLexer(CharStreams.fromString(code));
		TiBasicParser parser = new TiBasicParser(new CommonTokenStream(lexer));

		TiBasicParser.ScriptContext script = parser.script();

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(this, script);
	}

	// Append a collection of tokens
	public void appendInstruction(TiToken[] tokens) {
		for (TiToken token : tokens) {
			appendInstruction(token);
		}
	}

	// Append a single token
	public void appendInstruction(TiToken token) {
		tokens.add(token);
	}

	// Get the tokens (not compiled)
	public TiToken[] getTokens() {
		TiToken[] ret = new TiToken[tokens.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = tokens.get(i);
		}
		return ret;
	}

	// Compile tokens to bytecode
	public byte[] compile() {
		Logger.Log("Compiling tokens...");
		// Calculate the size
		int size = 0;
		for (TiToken token : tokens) {
			size += token.length;
		}
		// Allocate a byte array of size
		byte[] compiled = new byte[size];
		// Compensate for jumped bytes
		int jumped = 0;
		// Loop through
		for (int i = 0; i < compiled.length; i++) {
			// Get the current token
			TiToken current = tokens.get(i - jumped);
			// Set the first byte
			compiled[i] = current.hex_high;
			// Check for a second byte
			if (current.length > 1) {
				// Set the second byte
				i++;
				jumped++;
				compiled[i] = current.hex_low;
			}
		}
		// Done
		Logger.Log("Tokens compiled");
		return compiled;
	}

	@Override
	public void enterScript(TiBasicParser.ScriptContext ctx) {

	}

	@Override
	public void exitScript(TiBasicParser.ScriptContext ctx) {

	}

	@Override
	public void enterToken(TiBasicParser.TokenContext ctx) {

	}

	@Override
	public void exitToken(TiBasicParser.TokenContext ctx) {

	}

	@Override
	public void enterDisp(TiBasicParser.DispContext ctx) {
		appendInstruction(TiToken.DISP);
	}

	@Override
	public void exitDisp(TiBasicParser.DispContext ctx) {

	}

	@Override
	public void enterInput(TiBasicParser.InputContext ctx) {
		appendInstruction(TiToken.INPUT);
	}

	@Override
	public void exitInput(TiBasicParser.InputContext ctx) {

	}

	@Override
	public void enterLetter(TiBasicParser.LetterContext ctx) {
		appendInstruction(TiToken.getToken(ctx.getText()));
	}

	@Override
	public void exitLetter(TiBasicParser.LetterContext ctx) {

	}

	@Override
	public void enterColon(TiBasicParser.ColonContext ctx) {

	}

	@Override
	public void exitColon(TiBasicParser.ColonContext ctx) {

	}

	@Override
	public void enterComma(TiBasicParser.CommaContext ctx) {
		appendInstruction(TiToken.COMMA);
	}

	@Override
	public void exitComma(TiBasicParser.CommaContext ctx) {

	}

	@Override
	public void enterNumber(TiBasicParser.NumberContext ctx) {
		String numStr = ctx.NUMBER().getText();
		int numI = Integer.parseInt(numStr);
		try {
			TiToken[] tokens = TiToken.getNumber(numI);
			appendInstruction(tokens);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void exitNumber(TiBasicParser.NumberContext ctx) {

	}

	@Override
	public void enterPi(TiBasicParser.PiContext ctx) {

	}

	@Override
	public void exitPi(TiBasicParser.PiContext ctx) {

	}

	@Override
	public void enterE(TiBasicParser.EContext ctx) {

	}

	@Override
	public void exitE(TiBasicParser.EContext ctx) {

	}

	@Override
	public void enterI(TiBasicParser.IContext ctx) {

	}

	@Override
	public void exitI(TiBasicParser.IContext ctx) {

	}

	@Override
	public void enterQuote(TiBasicParser.QuoteContext ctx) {
		appendInstruction(TiToken.QUOTE);
	}

	@Override
	public void exitQuote(TiBasicParser.QuoteContext ctx) {

	}

	@Override
	public void enterNewline(TiBasicParser.NewlineContext ctx) {
		appendInstruction(TiToken.NEWLINE);
	}

	@Override
	public void exitNewline(TiBasicParser.NewlineContext ctx) {

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
}

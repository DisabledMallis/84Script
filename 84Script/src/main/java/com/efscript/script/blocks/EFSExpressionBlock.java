package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.BoolexprContext;
import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.script.IBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSExpressionBlock<T extends ExpressionContext> implements IBlock {
	// The context
	private T ctx;

	public EFSExpressionBlock(T ctx) {
		this.ctx = ctx;
	}

	// Compile the context to Ti-Basic tokens
	@Override
	public TiToken[] compile() {
		TiCompiler compiler = new TiCompiler();

		// Check if its a bracket expression,
		// if so, we need to compile the inner expression
		// and we can do this recursively
		boolean isBrack = ctx.OPEN_BRACKET() == null;
		if (isBrack) {
			// Create a new block on the current expression
			EFSExpressionBlock<ExpressionContext> block = new EFSExpressionBlock<ExpressionContext>(ctx.expression());
			// Append tokens
			compiler.appendInstruction(TiToken.OPEN_BRACKET);
			compiler.appendInstruction(block.compile());
			compiler.appendInstruction(TiToken.CLOSE_BRACKET);
		}
		// If its not a bracket expression, we
		// Can compile it to Ti-Basic
		else {
			// If its a bool expression, we want
			// to compile it before trying anything
			// else
			boolean isBoolExpr = ctx.boolexpr() != null;
			if (isBoolExpr) {
				// Get the boolexpr context
				BoolexprContext bectx = ctx.boolexpr();
				// If is the true keyword
				boolean isTrue = bectx.TRUE() != null;
				if (isTrue) {
					// 1 is the same as 'true'
					compiler.appendInstruction(TiToken.NUM_1);
				}
				boolean isFalse = bectx.TRUE() != null;
				if (isFalse) {
					// 0 is the same as 'false'
					compiler.appendInstruction(TiToken.NUM_0);
				}
			} else {
				// Check what type of expression it is
				boolean isAdd = ctx.ADD() != null;
				boolean isSub = ctx.SUB() != null;
				boolean isMul = ctx.MUL() != null;
				boolean isDiv = ctx.DIV() != null;
			}

		}

		return compiler.getTokens();
	}
}

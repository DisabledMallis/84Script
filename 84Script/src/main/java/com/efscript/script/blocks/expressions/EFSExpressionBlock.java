package com.efscript.script.blocks.expressions;

import com.efscript.antlr.EFScriptParser.BoolexprContext;
import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.NumberContext;
import com.efscript.antlr.EFScriptParser.ValueContext;
import com.efscript.script.blocks.EFSGenericExpression;
import com.efscript.script.blocks.EFSVarToken;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSExpressionBlock extends EFSGenericExpression<ExpressionContext> {

	public EFSExpressionBlock(ExpressionContext ctx) {
		super(ctx);
	}

	// Compile the context to Ti-Basic tokens
	@Override
	public TiToken[] compile() {
		TiCompiler compiler = new TiCompiler();

		ExpressionContext ctx = this.getCtx();
		// Check if its a bracket expression,
		// if so, we need to compile the inner expression
		// and we can do this recursively
		boolean isBrack = ctx.OPEN_BRACKET() == null;
		if (isBrack) {
			// Create a new block on the current expression
			EFSExpressionBlock block = new EFSExpressionBlock(this.getCtx().expression(0));
			// Append tokens
			compiler.appendInstruction(TiToken.OPEN_BRACKET);
			compiler.appendInstruction(block.compile());
			compiler.appendInstruction(TiToken.CLOSE_BRACKET);
		}
		// If its not a bracket expression, we
		// Can compile it to Ti-Basic
		else {
			// If its a value, we want to convert it
			// to the right format for the calc
			boolean isValueExpr = ctx.value() != null;
			if (isValueExpr) {
				ValueContext vctx = ctx.value();
				// Values can be either an identifier
				// or a number. Identifiers must be values
				// and not function names.
				boolean isIdentifier = vctx.identifier() != null;
				boolean isNumber = vctx.number() != null;

				if (isIdentifier) {
					// Get the identifier context
					IdentifierContext ictx = vctx.identifier();
					// Get a var token for the identifier
					EFSVarToken theVar = new EFSVarToken(ictx.getText());
					// Generate & append the reference code
					compiler.appendInstruction(theVar.compile());
				}
				if (isNumber) {
					NumberContext nctx = vctx.number();
					// Numbers can be 'pi' or 'e', and
					// the calculator already has these mathematical
					// constants, might as well use them
					boolean isPi = nctx.PI() != null;
					boolean isE = nctx.E() != null;
					if (isPi) {
						compiler.appendInstruction(TiToken.CONST_PI);
					} else if (isE) {
						compiler.appendInstruction(TiToken.CONST_E);
					} else {

					}
				}
			}

			// If its a bool expression, we want
			// to compile it before trying anything
			// else
			boolean isBoolExpr = ctx.boolexpr() != null;
			if (isBoolExpr) {
				// Get the boolexpr context
				BoolexprContext bectx = ctx.boolexpr();
				EFSBoolexprBlock bExpr = new EFSBoolexprBlock(bectx);
				compiler.appendInstruction(bExpr.compile());
			} else {
				// Check what type of expression it is
				boolean isAdd = ctx.ADD() != null;
				boolean isSub = ctx.SUB() != null;
				boolean isMul = ctx.MUL() != null;
				boolean isDiv = ctx.DIV() != null;

				// Create a new block on the current expression
				// Also compile it so that way operations can be done later
				EFSExpressionBlock first_block = new EFSExpressionBlock(ctx.expression(0));
				compiler.appendInstruction(first_block.compile());

				// Basic mathematical operations
				if (isAdd)
					compiler.appendInstruction(TiToken.ADD);
				if (isSub)
					compiler.appendInstruction(TiToken.SUBTRACT);
				if (isMul)
					compiler.appendInstruction(TiToken.MULTIPLY);
				if (isDiv)
					compiler.appendInstruction(TiToken.DIVIDE);

				// The second expression block
				EFSExpressionBlock second_block = new EFSExpressionBlock(this.getCtx().expression(1));
				compiler.appendInstruction(second_block.compile());
			}

		}

		return compiler.getTokens();
	}
}

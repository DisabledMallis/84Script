package com.efscript.script.blocks.expressions;

import com.efscript.antlr.EFScriptParser.BoolexprContext;
import com.efscript.script.blocks.EFSGenericExpression;
import com.efscript.script.blocks.EFSValueBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSBoolexprBlock extends EFSGenericExpression<BoolexprContext> {

	public EFSBoolexprBlock(BoolexprContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler compiler = new TiCompiler();
		BoolexprContext ctx = this.getCtx();

		// Non lo so perche questo non vuole funzionare
		if(ctx == null) {
			throw new Exception("Null bool ctx (WTF LOOOL)");
		}

		// Check for value
		boolean isValueExpr = ctx.value() != null;
		if (isValueExpr) {
			// Epic cool cool
			EFSValueBlock block = new EFSValueBlock(ctx.value());
			compiler.appendInstruction(block.compile());
		}

		// If is the 'true' keyword
		boolean isTrue = ctx.TRUE() != null;
		if (isTrue) {
			// 1 is the same as 'true'
			compiler.appendInstruction(TiToken.NUM_1);
		}
		// If is the 'false' keyword
		boolean isFalse = ctx.TRUE() != null;
		if (isFalse) {
			// 0 is the same as 'false'
			compiler.appendInstruction(TiToken.NUM_0);
		}
		// If isnt just true or false, it must start with a value.
		if (!isTrue && !isFalse) {
			// Value shit
			EFSValueBlock valBlock = new EFSValueBlock(ctx.value());
			compiler.appendInstruction(valBlock.compile());
			// Someone come up with a cooler way to do this, please, thanks
			boolean isGT = ctx.GREATER_THAN() != null;
			boolean isLT = ctx.LESS_THAN() != null;
			boolean isET = ctx.EQUAL_TO() != null;
			boolean isNET = ctx.NOT_EQUAL_TO() != null;
			boolean isGTOE = ctx.GREATER_THAN_OR_EQUAL() != null;
			boolean isLTOE = ctx.LESS_THAN_OR_EQUAL() != null;
			boolean isOr = ctx.OR() != null;
			boolean isAnd = ctx.AND() != null;

			// Bruhzowski
			if (isGT) {
				compiler.appendInstruction(TiToken.GREATER_THAN);
			}
			if (isLT) {
				compiler.appendInstruction(TiToken.LESS_THAN);
			}
			if (isET) {
				compiler.appendInstruction(TiToken.EQUALS);
			}
			if (isNET) {
				compiler.appendInstruction(TiToken.NOT_EQUAL);
			}
			if (isGTOE) {
				compiler.appendInstruction(TiToken.GREATER_THAN_OR_EQUAL);
			}
			if (isLTOE) {
				compiler.appendInstruction(TiToken.LESS_THAN_OR_EQUAL);
			}
			if (isOr) {
				compiler.appendInstruction(TiToken.OR);
			}
			if (isAnd) {
				compiler.appendInstruction(TiToken.AND);
			}

			// The right hand must be another expression
			BoolexprContext bCtx = ctx.boolexpr();
			if(bCtx != null) {
				EFSBoolexprBlock recBlock = new EFSBoolexprBlock(bCtx);
				compiler.appendInstruction(recBlock.compile());
			}
		}

		return compiler.getTokens();
	}

}

package com.efscript.script.blocks.expressions;

import com.efscript.antlr.EFScriptParser.BoolexprContext;
import com.efscript.script.blocks.EFSGenericExpression;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSBoolexprBlock extends EFSGenericExpression<BoolexprContext> {

	public EFSBoolexprBlock(BoolexprContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		TiCompiler compiler = new TiCompiler();
		BoolexprContext ctx = this.getCtx();
		// If is the true keyword
		boolean isTrue = ctx.TRUE() != null;
		if (isTrue) {
			// 1 is the same as 'true'
			compiler.appendInstruction(TiToken.NUM_1);
		}
		boolean isFalse = ctx.TRUE() != null;
		if (isFalse) {
			// 0 is the same as 'false'
			compiler.appendInstruction(TiToken.NUM_0);
		}
		return null;
	}

}

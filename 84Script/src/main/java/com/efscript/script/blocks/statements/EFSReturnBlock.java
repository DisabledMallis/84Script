package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.antlr.EFScriptParser.Return_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.expressions.EFSExpressionBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSReturnBlock extends EFSStatementBlock<Return_stmtContext> {

	public EFSReturnBlock(Return_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler miniComp = new TiCompiler();
		Return_stmtContext ctx = this.getCtx();

		ExpressionContext expr = ctx.expression();
		if(expr != null) {
			EFSExpressionBlock expBlock = new EFSExpressionBlock(expr);
			TiToken[] exprComp = expBlock.compile();

			miniComp.appendInstruction(exprComp);
		}
		else {
			miniComp.appendInstruction(TiToken.NUM_0); //No return value = return 0;
		}
		miniComp.appendInstruction(TiToken.STORE);
		miniComp.appendInstruction(TiToken.LETTER_C); //The return register ('C')
		miniComp.appendInstruction(TiToken.NEWLINE);

		return miniComp.getTokens();
	}
}

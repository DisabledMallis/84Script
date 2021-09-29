package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.BoolexprContext;
import com.efscript.antlr.EFScriptParser.If_stmtContext;
import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.expressions.EFSBoolexprBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSIfBlock extends EFSStatementBlock<If_stmtContext> {
	public EFSIfBlock(If_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler comp = new TiCompiler();

		If_stmtContext ctx = this.getCtx();

		comp.appendInstruction(TiToken.IF);
		BoolexprContext bctx = ctx.boolexpr();
		EFSBoolexprBlock bBlock = new EFSBoolexprBlock(bctx);
		comp.appendInstruction(bBlock.compile());
		comp.appendInstruction(TiToken.NEWLINE);
		comp.appendInstruction(TiToken.THEN);
		comp.appendInstruction(TiToken.NEWLINE);

		StatementContext sCtx = ctx.statement();
		EFSStatementBlock<?> sBlock = EFSStatementBlock.getAppropriate(sCtx);
		comp.appendInstruction(sBlock.compile());

		comp.appendInstruction(TiToken.END);
		comp.appendInstruction(TiToken.NEWLINE);

		return comp.getTokens();
	}
}

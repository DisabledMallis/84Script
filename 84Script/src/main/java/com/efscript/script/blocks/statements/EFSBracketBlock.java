package com.efscript.script.blocks.statements;

import java.util.List;

import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSBracketBlock extends EFSStatementBlock<StatementContext> {

	public EFSBracketBlock(StatementContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler comp = new TiCompiler();

		StatementContext ctx = this.getCtx();
		List<StatementContext> stmts = ctx.statement();
		for(StatementContext sCtx : stmts) {
			EFSStatementBlock<?> sBlock = EFSStatementBlock.getAppropriate(sCtx);
			comp.appendInstruction(sBlock.compile());
		}

		return comp.getTokens();
	}
	
}

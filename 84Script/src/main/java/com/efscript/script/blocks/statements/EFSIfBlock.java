package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.If_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSIfBlock extends EFSStatementBlock<If_stmtContext> {
	public EFSIfBlock(If_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

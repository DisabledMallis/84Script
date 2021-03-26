package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Inc_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSIncBlock extends EFSStatementBlock<Inc_stmtContext> {

	public EFSIncBlock(Inc_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

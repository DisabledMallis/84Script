package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.Inc_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSIncBlock extends EFSGenericStmtBlock<Inc_stmtContext> {

	public EFSIncBlock(Inc_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

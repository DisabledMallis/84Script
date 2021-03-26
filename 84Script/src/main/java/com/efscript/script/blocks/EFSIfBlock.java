package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.If_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSIfBlock extends EFSGenericStmtBlock<If_stmtContext> {
	public EFSIfBlock(If_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

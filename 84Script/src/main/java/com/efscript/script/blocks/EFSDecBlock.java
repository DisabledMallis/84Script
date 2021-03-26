package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.Dec_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSDecBlock extends EFSGenericStmtBlock<Dec_stmtContext> {

	public EFSDecBlock(Dec_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

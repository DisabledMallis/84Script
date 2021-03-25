package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Inc_stmtContext;
import com.EFScript.Ti.TiToken;

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

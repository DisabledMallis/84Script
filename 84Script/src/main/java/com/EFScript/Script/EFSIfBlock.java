package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.If_stmtContext;
import com.EFScript.Ti.TiToken;

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

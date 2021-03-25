package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Dec_stmtContext;
import com.EFScript.Ti.TiToken;

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

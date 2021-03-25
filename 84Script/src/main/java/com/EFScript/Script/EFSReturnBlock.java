package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Return_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSReturnBlock extends EFSGenericStmtBlock<Return_stmtContext> {

	EFSReturnBlock(Return_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.While_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSWhileBlock extends EFSGenericStmtBlock<While_stmtContext> {

	EFSWhileBlock(While_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

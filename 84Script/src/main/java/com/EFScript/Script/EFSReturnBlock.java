package com.efscript.script;

import com.efscript.antlr.EFScriptParser.Return_stmtContext;
import com.efscript.ti.TiToken;

public class EFSReturnBlock extends EFSGenericStmtBlock<Return_stmtContext> {

	EFSReturnBlock(Return_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

package com.efscript.script;

import com.efscript.antlr.EFScriptParser.While_stmtContext;
import com.efscript.ti.TiToken;

public class EFSWhileBlock extends EFSGenericStmtBlock<While_stmtContext> {

	EFSWhileBlock(While_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

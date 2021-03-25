package com.efscript.script;

import com.efscript.antlr.EFScriptParser.Assign_stmtContext;
import com.efscript.ti.TiToken;

public class EFSAssignBlock extends EFSGenericStmtBlock<Assign_stmtContext> {

	EFSAssignBlock(Assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

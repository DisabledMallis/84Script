package com.efscript.script;

import com.efscript.antlr.EFScriptParser.Add_assign_stmtContext;
import com.efscript.ti.TiToken;

public class EFSAddAssignBlock extends EFSGenericStmtBlock<Add_assign_stmtContext> {
	EFSAddAssignBlock(Add_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

package com.efscript.script;

import com.efscript.antlr.EFScriptParser.Div_assign_stmtContext;
import com.efscript.ti.TiToken;

public class EFSDivAssignBlock extends EFSGenericStmtBlock<Div_assign_stmtContext> {

	EFSDivAssignBlock(Div_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

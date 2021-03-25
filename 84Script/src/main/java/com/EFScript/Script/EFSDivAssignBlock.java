package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Div_assign_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSDivAssignBlock extends EFSGenericStmtBlock<Div_assign_stmtContext> {

	EFSDivAssignBlock(Div_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

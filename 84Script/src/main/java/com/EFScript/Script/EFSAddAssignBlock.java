package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Add_assign_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSAddAssignBlock extends EFSGenericStmtBlock<Add_assign_stmtContext> {
	EFSAddAssignBlock(Add_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

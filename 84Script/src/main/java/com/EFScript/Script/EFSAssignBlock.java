package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Assign_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSAssignBlock extends EFSGenericStmtBlock<Assign_stmtContext> {

	EFSAssignBlock(Assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

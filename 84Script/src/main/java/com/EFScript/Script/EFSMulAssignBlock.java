package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Mul_assign_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSMulAssignBlock extends EFSGenericStmtBlock<Mul_assign_stmtContext> {

	EFSMulAssignBlock(Mul_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

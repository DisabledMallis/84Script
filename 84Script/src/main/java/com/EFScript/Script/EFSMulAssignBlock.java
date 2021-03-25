package com.efscript.script;

import com.efscript.antlr.EFScriptParser.Mul_assign_stmtContext;
import com.efscript.ti.TiToken;

public class EFSMulAssignBlock extends EFSGenericStmtBlock<Mul_assign_stmtContext> {

	EFSMulAssignBlock(Mul_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

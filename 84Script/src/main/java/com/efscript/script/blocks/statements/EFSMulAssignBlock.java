package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Mul_assign_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSMulAssignBlock extends EFSGenericStmtBlock<Mul_assign_stmtContext> {

	public EFSMulAssignBlock(Mul_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Mul_assign_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSMulAssignBlock extends EFSStatementBlock<Mul_assign_stmtContext> {

	public EFSMulAssignBlock(Mul_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

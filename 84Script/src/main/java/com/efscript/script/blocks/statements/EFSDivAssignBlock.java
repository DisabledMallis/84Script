package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Div_assign_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSDivAssignBlock extends EFSStatementBlock<Div_assign_stmtContext> {

	public EFSDivAssignBlock(Div_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

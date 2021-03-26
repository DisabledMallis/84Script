package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Assign_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSAssignBlock extends EFSStatementBlock<Assign_stmtContext> {

	public EFSAssignBlock(Assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.Assign_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSAssignBlock extends EFSGenericStmtBlock<Assign_stmtContext> {

	public EFSAssignBlock(Assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

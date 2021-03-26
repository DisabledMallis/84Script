package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Add_assign_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSAddAssignBlock extends EFSGenericStmtBlock<Add_assign_stmtContext> {
	public EFSAddAssignBlock(Add_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Return_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSReturnBlock extends EFSGenericStmtBlock<Return_stmtContext> {

	public EFSReturnBlock(Return_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.While_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSWhileBlock extends EFSStatementBlock<While_stmtContext> {

	public EFSWhileBlock(While_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

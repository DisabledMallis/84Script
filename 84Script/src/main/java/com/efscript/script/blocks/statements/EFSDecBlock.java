package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Dec_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiToken;

public class EFSDecBlock extends EFSStatementBlock<Dec_stmtContext> {

	public EFSDecBlock(Dec_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

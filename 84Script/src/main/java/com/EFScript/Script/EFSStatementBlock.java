package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.StatementContext;
import com.EFScript.Ti.TiToken;

//Statement compiler
public class EFSStatementBlock implements IBlock {
	StatementContext ctx;
	public EFSStatementBlock(StatementContext ctx)
	{
		this.ctx = ctx;
	}
	@Override
	public TiToken[] compile() {
		// TODO Auto-generated method stub
		return null;
	}
}

package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.StatementContext;
import com.EFScript.Ti.TiToken;

//Statement compiler
public class EFSStatementBlock {
	StatementContext ctx;
	public EFSStatementBlock(StatementContext ctx)
	{
		this.ctx = ctx;
	}
	public TiToken[] compiled()
	{
		return null;
	}
}

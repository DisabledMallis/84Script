package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Var_stmtContext;
import com.EFScript.Ti.TiToken;

public class EFSVarBlock extends EFSGenericStmtBlock<Var_stmtContext>{

	public EFSVarBlock(Var_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
	
}

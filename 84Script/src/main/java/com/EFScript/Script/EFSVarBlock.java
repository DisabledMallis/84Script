package com.efscript.script;

import com.efscript.antlr.EFScriptParser.Var_stmtContext;
import com.efscript.ti.TiToken;

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

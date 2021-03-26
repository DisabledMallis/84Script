package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.Var_stmtContext;
import com.efscript.script.EFSGenericStmtBlock;
import com.efscript.ti.TiToken;

public class EFSVarBlock extends EFSGenericStmtBlock<Var_stmtContext>{
	public EFSVarBlock(Var_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		//Get the identifier text
		IdentifierContext iCtx = this.getCtx().identifier();
		String varStr = iCtx.getText();
		//Add the var for later reference
		currentCompiler().addVar(varStr);

		//Process the initial value
		this.getCtx().expression();
		return null;
	}
	
}

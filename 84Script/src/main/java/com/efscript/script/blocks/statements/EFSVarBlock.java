package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.Var_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.EFSVarToken;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSVarBlock extends EFSStatementBlock<Var_stmtContext>{
	public EFSVarBlock(Var_stmtContext ctx)
	{
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		//TiCompiler to get de tokens
		TiCompiler comp = new TiCompiler();

		//Get the identifier text
		IdentifierContext iCtx = this.getCtx().identifier();
		String varStr = iCtx.getText();
		//Add the var for later reference
		EFSVarToken varToken = new EFSVarToken(varStr);

		//Process the initial value
		this.getCtx().expression();

		varToken.compile();

		return null;
	}
	
}

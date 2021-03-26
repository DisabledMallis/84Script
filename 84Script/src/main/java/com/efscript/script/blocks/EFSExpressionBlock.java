package com.efscript.script.blocks;

import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.script.IBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSExpressionBlock implements IBlock {

	//The context
	private ExpressionContext ctx;
	public EFSExpressionBlock(ExpressionContext ctx)
	{
		this.ctx = ctx;
	}

	//Compile the context to Ti-Basic tokens
	@Override
	public TiToken[] compile() {
		TiCompiler compiler = new TiCompiler();

		return compiler.getTokens();
	}
	
}

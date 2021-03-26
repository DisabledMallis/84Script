package com.efscript.script;

import java.util.ArrayList;
import java.util.List;

import com.efscript.antlr.EFScriptParser.Func_paramsContext;
import com.efscript.antlr.EFScriptParser.FunctionContext;
import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.ti.TiToken;

public class EFSFunctionBlock implements IBlock {

	List<EFSGenericStmtBlock<?>> blocks;
	Func_paramsContext parameters;

	public EFSFunctionBlock(FunctionContext ctx)
	{
		this.parameters = ctx.func_params();
		this.blocks = new ArrayList<>();
		StatementContext stmtCtx = ctx.statement();
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

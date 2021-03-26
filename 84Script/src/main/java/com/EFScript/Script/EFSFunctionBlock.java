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

	//Create a func block from a context
	public EFSFunctionBlock(FunctionContext ctx)
	{
		//Init vars
		this.parameters = ctx.func_params();
		this.blocks = new ArrayList<>();

		//Try getting a sub context
		StatementContext stmtCtx = ctx.statement();
		//If successful
		if(stmtCtx != null)
		{
			//Iterate sub-contexts
			for(StatementContext leCtx : stmtCtx.statement())
			{
				//Store the code block(s)
				EFSGenericStmtBlock<?> stmtBlock = EFSGenStmt.getAppropriate(leCtx);
				this.blocks.add(stmtBlock);
			}
			return;
		}
		//If not, must be a single statement, therefore we
		//can just create the appropriate block
		//and store that.
		EFSGenericStmtBlock<?> stmtBlock = EFSGenStmt.getAppropriate(stmtCtx);
		this.blocks.add(stmtBlock);
		return;
	}

	@Override
	public TiToken[] compile() {
		return null;
	}
}

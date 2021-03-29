package com.efscript.script.blocks;

import java.util.ArrayList;
import java.util.List;

import com.efscript.Logger;
import com.efscript.antlr.EFScriptParser.Func_paramsContext;
import com.efscript.antlr.EFScriptParser.FunctionContext;
import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.script.IBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSFunctionBlock implements IBlock {

	List<EFSStatementBlock<?>> blocks;
	Func_paramsContext parameters;

	// Create a func block from a context
	public EFSFunctionBlock(FunctionContext ctx) {
		// Init vars
		this.parameters = ctx.func_params();
		this.blocks = new ArrayList<>();

		// Try getting a sub context
		StatementContext stmtCtx = ctx.statement();
		// If successful
		if (stmtCtx != null) {
			// Iterate sub-contexts
			for (StatementContext leCtx : stmtCtx.statement()) {
				// Store the code block(s)
				EFSStatementBlock<?> stmtBlock = EFSStatementBlock.getAppropriate(leCtx);
				if (stmtBlock == null)
					Logger.Log("Null subStmt");
				this.blocks.add(stmtBlock);
			}
			return;
		}
		// If not, must be a single statement, therefore we
		// can just create the appropriate block
		// and store that.
		EFSStatementBlock<?> stmtBlock = EFSStatementBlock.getAppropriate(stmtCtx);
		if (stmtBlock == null)
			Logger.Log("Null single Stmt");
		this.blocks.add(stmtBlock);
		return;
	}

	@Override
	public TiToken[] compile() {
		TiCompiler comp = new TiCompiler();

		for (EFSStatementBlock<?> block : this.blocks) {
			if (block == null) {
				Logger.Log("Null block... what?");
				return null;
			}
			comp.appendInstruction(block.compile());
		}

		return comp.getTokens();
	}
}

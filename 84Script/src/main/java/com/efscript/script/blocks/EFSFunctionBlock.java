package com.efscript.script.blocks;

import java.util.ArrayList;
import java.util.List;

import com.efscript.Logger;
import com.efscript.antlr.EFScriptParser;
import com.efscript.antlr.EFScriptParser.Func_paramsContext;
import com.efscript.antlr.EFScriptParser.FunctionContext;
import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.script.Context;
import com.efscript.script.IBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSFunctionBlock implements IBlock {

	String name;
	List<EFSStatementBlock<?>> blocks;
	Func_paramsContext parameters;

	// Create a func block from a context
	public EFSFunctionBlock(FunctionContext ctx) throws Exception {
		// Init vars
		this.parameters = ctx.func_params();
		this.blocks = new ArrayList<>();
		this.name = ctx.identifier().getText();

		boolean isCurl = ctx.statement().OPEN_CURLEY() != null;
		StatementContext stmtCtx = ctx.statement();
		// If successful
		if (isCurl) {
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
			throw new Exception("Null statement? Very bad");
		this.blocks.add(stmtBlock);

		// Push a new context
		Context newCtx = new Context("FUNC: "+this.name);
		//Add parameters to the new context
		for(EFScriptParser.IdentifierContext iCtx : parameters.identifier()) {
			newCtx.addParameter(iCtx.getText());
		}
		//Push the context
		Context.pushContext(newCtx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler comp = new TiCompiler();

		for (EFSStatementBlock<?> block : this.blocks) {
			if (block == null) {
				throw new Exception("A code block for a function was null? ");
			}
			comp.appendInstruction(block.compile());
		}

		comp.appendInstruction(TiToken.NEWLINE);

		return comp.getTokens();
	}
}

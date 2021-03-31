package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.Var_stmtContext;
import com.efscript.script.Context;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.expressions.EFSExpressionBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSVarBlock extends EFSStatementBlock<Var_stmtContext> {
	public EFSVarBlock(Var_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		// TiCompiler to get de tokens
		TiCompiler comp = new TiCompiler();

		// Get the identifier text
		IdentifierContext iCtx = this.getCtx().identifier();
		String varStr = iCtx.getText();
		// Add the var for later reference
		Context.currentContext().addIdentifier(varStr);
		TiToken[] accessor = Context.currentContext().genAccessor(iCtx.getText());

		// Process the initial value
		ExpressionContext exprCtx = this.getCtx().expression();
		EFSExpressionBlock exprBlock = new EFSExpressionBlock(exprCtx);

		// Generate the storage code
		comp.appendInstruction(exprBlock.compile());
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(accessor);

		return comp.getTokens();
	}

}

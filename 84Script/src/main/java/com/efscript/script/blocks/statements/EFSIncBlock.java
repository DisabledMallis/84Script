package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.Inc_stmtContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.EFSVarToken;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSIncBlock extends EFSStatementBlock<Inc_stmtContext> {

	public EFSIncBlock(Inc_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		TiCompiler miniTiComp = new TiCompiler();
		// Get the context
		Inc_stmtContext incCtx = this.getCtx();
		// Get the identifier
		IdentifierContext iCtx = incCtx.identifier();
		// The identifier must be a var, and we can assume this.
		EFSVarToken vToken = new EFSVarToken(iCtx.getText());

		/*
		 * Should compile to: L1(X)+1->L1(X)
		 */
		// Append the accessor
		miniTiComp.appendInstruction(vToken.compile());
		// Add token
		miniTiComp.appendInstruction(TiToken.ADD);
		// Num 1
		miniTiComp.appendInstruction(TiToken.NUM_1);
		// Store token (->)
		miniTiComp.appendInstruction(TiToken.STORE);
		// The accessor
		miniTiComp.appendInstruction(vToken.compile());
		return miniTiComp.getTokens();
	}
}

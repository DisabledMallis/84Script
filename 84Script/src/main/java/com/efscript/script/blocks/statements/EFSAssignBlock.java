package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Assign_stmtContext;
import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.EFSVarToken;
import com.efscript.script.blocks.expressions.EFSExpressionBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSAssignBlock extends EFSStatementBlock<Assign_stmtContext> {

	public EFSAssignBlock(Assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() {
		// Initialize TiCompiler
		TiCompiler minComp = new TiCompiler();

		/*
		 * Generated output should be: <expression>->L1(X)
		 */

		// Get context
		Assign_stmtContext aCtx = this.getCtx();
		// Expression to evaluate & store
		ExpressionContext eCtx = aCtx.expression();
		// Create an expression block instance
		EFSExpressionBlock exprBlock = new EFSExpressionBlock(eCtx);
		// Compile it
		minComp.appendInstruction(exprBlock.compile());
		// Store token
		minComp.appendInstruction(TiToken.STORE);
		// Get the identifier
		IdentifierContext iCtx = aCtx.identifier();
		// Get the var accessor to store the expression into
		EFSVarToken vTok = new EFSVarToken(iCtx.getText());
		// Compile the accessor
		minComp.appendInstruction(vTok.compile());
		// Return the result
		return minComp.getTokens();
	}

}

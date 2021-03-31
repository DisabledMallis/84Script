package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Add_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.ValueContext;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.EFSValueBlock;
import com.efscript.script.blocks.EFSVarToken;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSAddAssignBlock extends EFSStatementBlock<Add_assign_stmtContext> {
	public EFSAddAssignBlock(Add_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler comp = new TiCompiler();
		Add_assign_stmtContext ctx = this.getCtx();

		IdentifierContext iCtx = ctx.identifier();
		ValueContext vCtx = ctx.value();

		EFSVarToken vToken = new EFSVarToken(iCtx.getText());
		EFSValueBlock vBlock = new EFSValueBlock(vCtx);

		// L(X)+VALUE->L(X)
		comp.appendInstruction(vToken.compile());
		comp.appendInstruction(TiToken.ADD);
		comp.appendInstruction(vBlock.compile());
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(vToken.compile());
		comp.appendInstruction(TiToken.NEWLINE);

		return comp.getTokens();
	}
}

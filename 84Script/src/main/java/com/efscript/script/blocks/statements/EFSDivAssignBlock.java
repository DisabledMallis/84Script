package com.efscript.script.blocks.statements;

import com.efscript.antlr.EFScriptParser.Div_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.IdentifierContext;
import com.efscript.antlr.EFScriptParser.ValueContext;
import com.efscript.script.Context;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.script.blocks.EFSValueBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSDivAssignBlock extends EFSStatementBlock<Div_assign_stmtContext> {

	public EFSDivAssignBlock(Div_assign_stmtContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler comp = new TiCompiler();
		Div_assign_stmtContext ctx = this.getCtx();

		IdentifierContext iCtx = ctx.identifier();
		ValueContext vCtx = ctx.value();

		TiToken[] accessor = Context.currentContext().genAccessor(iCtx.getText());
		EFSValueBlock vBlock = new EFSValueBlock(vCtx);

		// L(X)/VALUE->L(X)
		comp.appendInstruction(accessor);
		comp.appendInstruction(TiToken.DIVIDE);
		comp.appendInstruction(vBlock.compile());
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(accessor);
		comp.appendInstruction(TiToken.NEWLINE);

		return comp.getTokens();
	}
	
}

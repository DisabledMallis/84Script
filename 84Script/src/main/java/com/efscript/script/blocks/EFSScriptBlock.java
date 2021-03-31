package com.efscript.script.blocks;

import com.efscript.Logger;
import com.efscript.antlr.EFScriptParser.FunctionContext;
import com.efscript.antlr.EFScriptParser.ScriptContext;
import com.efscript.antlr.EFScriptParser.StatementContext;
import com.efscript.script.ABlock;
import com.efscript.script.Context;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSScriptBlock extends ABlock<ScriptContext> {

	public EFSScriptBlock(ScriptContext ctx) {
		super(ctx);
	}

	@Override
	public TiToken[] compile() throws Exception {
		TiCompiler comp = new TiCompiler();
		ScriptContext ctx = this.getCtx();
		Context.pushContext(new Context("SCRIPT"));

		// Initialization section
		// Basically just reset the registers
		// (And hope I=0, otherwise the program will be die)
		/*
		 * If I=0 Then 0→G 0→F 0→C 1→I End
		 */
		// IF I=0
		// Then
		comp.appendInstruction(TiToken.IF);
		comp.appendInstruction(TiToken.LETTER_I);
		comp.appendInstruction(TiToken.EQUALS);
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.NEWLINE);
		comp.appendInstruction(TiToken.THEN);
		comp.appendInstruction(TiToken.NEWLINE);
		/*
		 * 0→G 0→F 0→C 1→I
		 */
		// 0→G
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.LETTER_G);
		comp.appendInstruction(TiToken.NEWLINE);
		// 0→F
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.LETTER_F);
		comp.appendInstruction(TiToken.NEWLINE);
		// 0→C
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.LETTER_C);
		comp.appendInstruction(TiToken.NEWLINE);
		// 1→I
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.LETTER_I);
		comp.appendInstruction(TiToken.NEWLINE);
		// END
		comp.appendInstruction(TiToken.END);
		comp.appendInstruction(TiToken.NEWLINE);

		// Function table
		/*
		 * //G determines if a func is called If G>0 -|---------------Funcs must be
		 * defined at thr top of the script Then -| //F is which function If F=0 Then
		 * //L₂ is the parameter stack L₂(1)+L₂(2)→C
		 * 
		 * End
		 * 
		 * End
		 */
		comp.appendInstruction(TiToken.IF);
		comp.appendInstruction(TiToken.LETTER_G);
		comp.appendInstruction(TiToken.GREATER_THAN);
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.NEWLINE);
		comp.appendInstruction(TiToken.THEN);
		comp.appendInstruction(TiToken.NEWLINE);

		boolean hasFunc = ctx.function() != null;
		if (hasFunc) {
			for (int funcId = 0; funcId < ctx.function().size(); funcId++) {
				/*
				 * Compiles to: If F=funcId Then <funcCode>
				 */
				comp.appendInstruction(TiToken.IF);
				comp.appendInstruction(TiToken.LETTER_F);
				comp.appendInstruction(TiToken.EQUALS);
				comp.appendInstruction(TiToken.getNumber(funcId));
				comp.appendInstruction(TiToken.NEWLINE);
				comp.appendInstruction(TiToken.THEN);
				comp.appendInstruction(TiToken.NEWLINE);

				FunctionContext code = ctx.function(funcId);
				EFSFunctionBlock funcBlock = new EFSFunctionBlock(code);
				comp.appendInstruction(funcBlock.compile());

				comp.appendInstruction(TiToken.END);
				comp.appendInstruction(TiToken.NEWLINE);
			}
		}
		comp.appendInstruction(TiToken.END);
		comp.appendInstruction(TiToken.NEWLINE);

		for (StatementContext stmt : ctx.statement()) {
			EFSStatementBlock<?> stmtBlock = EFSStatementBlock.getAppropriate(stmt);
			comp.appendInstruction(stmtBlock.compile());
			comp.appendInstruction(TiToken.NEWLINE);
		}

		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.LETTER_I);

		return comp.getTokens();
	}

}

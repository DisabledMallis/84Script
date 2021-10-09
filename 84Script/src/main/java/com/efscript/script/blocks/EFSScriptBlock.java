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
		String scriptMetaName = ctx.header().meta().scriptName().identifier().getText();
		Context.pushContext(new Context(scriptMetaName));

		// Pre initialization
		// Due to the fact we use matrices now, we need to check the
		// dimensions of the matrix to see if its even defined. If its undefined, we should
		// define it with 1x1 matrix filled with 0. From then on, the rest of the program
		// should safely size the table.
		/*
		 * dim([J])->L1
		 * If L1(1)=0 or L1(2)=0
		 * Then
		 * [[0]]->[J]
		 * End
		 */

		// Initialization section
		// Basically just reset the registers
		// (And hope I=0, otherwise the program will be die)
		/*
		 * If [J](1,1)=0
		 * Then
		 * 1->[J](1,1)
		 * 0->[J](1,2)
		 * 0->[J](1,3)
		 * 0->[J](1,4)
		 * 1->[J](1,5)
		 * End
		 */
		// IF [J](1,1)=0
		// Then
		comp.appendInstruction(TiToken.IF);
		comp.appendInstruction(TiToken.MATRIX_J);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.COMMA);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		comp.appendInstruction(TiToken.EQUALS);
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.NEWLINE);
		comp.appendInstruction(TiToken.THEN);
		comp.appendInstruction(TiToken.NEWLINE);
		/*
		 * 1->[J](1,1)
		 * 0->[J](1,2)
		 * 0->[J](1,3)
		 * 0->[J](1,4)
		 * 1->[J](1,5)
		 */
		// 1->[J](1,1)
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.MATRIX_J);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.COMMA);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		comp.appendInstruction(TiToken.NEWLINE);
		// 0->[J](1,2)
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.MATRIX_J);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.COMMA);
		comp.appendInstruction(TiToken.NUM_2);
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		comp.appendInstruction(TiToken.NEWLINE);
		// 0->[J](1,3)
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.MATRIX_J);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.COMMA);
		comp.appendInstruction(TiToken.NUM_3);
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		comp.appendInstruction(TiToken.NEWLINE);
		// 0->[J](1,4)
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.MATRIX_J);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.COMMA);
		comp.appendInstruction(TiToken.NUM_4);
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		comp.appendInstruction(TiToken.NEWLINE);
		// 1->[J](1,5)
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.MATRIX_J);
		comp.appendInstruction(TiToken.OPEN_BRACKET);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.COMMA);
		comp.appendInstruction(TiToken.NUM_5);
		comp.appendInstruction(TiToken.CLOSE_BRACKET);
		comp.appendInstruction(TiToken.NEWLINE);
		// END
		comp.appendInstruction(TiToken.END);
		comp.appendInstruction(TiToken.NEWLINE);

		// Function table
		/*
		 * //[J](1,3) determines if a func is called
		 * If [J](1,3)>0
		 * //Funcs must be defined at the top of the script
		 * Then
		 * //F is which function If F=0 Then
		 * //L₂ is the parameter stack L₂(1)+L₂(2)→C
		 * End
		 * End
		 */
		//TODO: Finish updating this file
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

				Context.scriptContext().addFunction(code.identifier().getText(), funcId);
			}
		}
		comp.appendInstruction(TiToken.END);
		comp.appendInstruction(TiToken.NEWLINE);

		comp.appendInstruction(TiToken.IF);
		comp.appendInstruction(TiToken.LETTER_G);
		comp.appendInstruction(TiToken.EQUALS);
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.NEWLINE);
		comp.appendInstruction(TiToken.THEN);
		comp.appendInstruction(TiToken.NEWLINE);
		for (StatementContext stmt : ctx.statement()) {
			EFSStatementBlock<?> stmtBlock = EFSStatementBlock.getAppropriate(stmt);
			comp.appendInstruction(stmtBlock.compile());
			comp.appendInstruction(TiToken.NEWLINE);
		}

		comp.appendInstruction(TiToken.END);
		comp.appendInstruction(TiToken.NEWLINE);
		comp.appendInstruction(TiToken.NUM_0);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(TiToken.LETTER_I);

		return comp.getTokens();
	}

}

package com.efscript.script.blocks;

import com.efscript.Logger;
import com.efscript.antlr.EFScriptParser.Add_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.Assign_stmtContext;
import com.efscript.antlr.EFScriptParser.Dec_stmtContext;
import com.efscript.antlr.EFScriptParser.Div_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.If_stmtContext;
import com.efscript.antlr.EFScriptParser.Inc_stmtContext;
import com.efscript.antlr.EFScriptParser.Mul_assign_stmtContext;
import com.efscript.antlr.EFScriptParser.Return_stmtContext;
import com.efscript.antlr.EFScriptParser.Var_stmtContext;
import com.efscript.antlr.EFScriptParser.While_stmtContext;
import com.efscript.script.IBlock;
import com.efscript.script.blocks.statements.EFSAddAssignBlock;
import com.efscript.script.blocks.statements.EFSAssignBlock;
import com.efscript.script.blocks.statements.EFSDecBlock;
import com.efscript.script.blocks.statements.EFSDivAssignBlock;
import com.efscript.script.blocks.statements.EFSIfBlock;
import com.efscript.script.blocks.statements.EFSIncBlock;
import com.efscript.script.blocks.statements.EFSMulAssignBlock;
import com.efscript.script.blocks.statements.EFSReturnBlock;
import com.efscript.script.blocks.statements.EFSVarBlock;
import com.efscript.script.blocks.statements.EFSWhileBlock;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSStatementBlock<T extends ParserRuleContext> implements IBlock {

	// Create the appropriate block
	public static EFSStatementBlock<?> getAppropriate(ParserRuleContext ctx) {
		// TODO: FUck. this design doesnt work at all as I expected. All of these are
		// StatementContexts, and they arent their actual type. This is bad.
		// Check what kind of context it is, and create that type of block.
		if (ctx instanceof If_stmtContext) {
			return new EFSIfBlock((If_stmtContext) ctx);
		}
		if (ctx instanceof Dec_stmtContext) {
			return new EFSDecBlock((Dec_stmtContext) ctx);
		}
		if (ctx instanceof Inc_stmtContext) {
			return new EFSIncBlock((Inc_stmtContext) ctx);
		}
		if (ctx instanceof Var_stmtContext) {
			return new EFSVarBlock((Var_stmtContext) ctx);
		}
		if (ctx instanceof While_stmtContext) {
			return new EFSWhileBlock((While_stmtContext) ctx);
		}
		if (ctx instanceof Assign_stmtContext) {
			return new EFSAssignBlock((Assign_stmtContext) ctx);
		}
		if (ctx instanceof Return_stmtContext) {
			return new EFSReturnBlock((Return_stmtContext) ctx);
		}
		if (ctx instanceof Add_assign_stmtContext) {
			return new EFSAddAssignBlock((Add_assign_stmtContext) ctx);
		}
		if (ctx instanceof Div_assign_stmtContext) {
			return new EFSDivAssignBlock((Div_assign_stmtContext) ctx);
		}
		if (ctx instanceof Mul_assign_stmtContext) {
			return new EFSMulAssignBlock((Mul_assign_stmtContext) ctx);
		}
		try {
			throw new Exception("Unknown statement!");
		} catch (Exception e) {
			Logger.Log(ctx.getText());
		}
		return null;
	}

	private T ctx;

	public EFSStatementBlock(T ctx) {
		this.ctx = ctx;
	}

	public T getCtx() {
		return this.ctx;
	}

}

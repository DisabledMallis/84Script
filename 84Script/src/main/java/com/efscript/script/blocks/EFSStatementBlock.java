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
import com.efscript.antlr.EFScriptParser.StatementContext;
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
import com.efscript.script.blocks.statements.EFSSubAssignBlock;
import com.efscript.script.blocks.statements.EFSVarBlock;
import com.efscript.script.blocks.statements.EFSWhileBlock;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSStatementBlock<T extends ParserRuleContext> implements IBlock {

	// Create the appropriate block
	public static EFSStatementBlock<?> getAppropriate(StatementContext ctx) {
		// Check what kind of context it is
		boolean isIf = ctx.if_stmt() != null;
		boolean isDec = ctx.dec_stmt() != null;
		boolean isInc = ctx.inc_stmt() != null;
		boolean isVar = ctx.var_stmt() != null;
		boolean isWhile = ctx.while_stmt() != null;
		boolean isAssign = ctx.assign_stmt() != null;
		boolean isReturn = ctx.return_stmt() != null;
		boolean isAddAssign = ctx.add_assign_stmt() != null;
		boolean isSubAssign = ctx.add_assign_stmt() != null;
		boolean isMulAssign = ctx.add_assign_stmt() != null;
		boolean isDivAssign = ctx.add_assign_stmt() != null;

		// create that type of block.
		if (isIf) {
			return new EFSIfBlock(ctx.if_stmt());
		}
		if (isDec) {
			return new EFSDecBlock(ctx.dec_stmt());
		}
		if (isInc) {
			return new EFSIncBlock(ctx.inc_stmt());
		}
		if (isVar) {
			return new EFSVarBlock(ctx.var_stmt());
		}
		if (isWhile) {
			return new EFSWhileBlock(ctx.while_stmt());
		}
		if (isAssign) {
			return new EFSAssignBlock(ctx.assign_stmt());
		}
		if (isReturn) {
			return new EFSReturnBlock(ctx.return_stmt());
		}
		if (isAddAssign) {
			return new EFSAddAssignBlock(ctx.add_assign_stmt());
		}
		if (isSubAssign) {
			return new EFSSubAssignBlock(ctx.sub_assign_stmt());
		}
		if (isMulAssign) {
			return new EFSMulAssignBlock(ctx.mul_assign_stmt());
		}
		if (isDivAssign) {
			return new EFSDivAssignBlock(ctx.div_assign_stmt());
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

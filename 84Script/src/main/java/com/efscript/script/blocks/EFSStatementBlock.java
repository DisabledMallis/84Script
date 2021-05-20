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
import com.efscript.script.ABlock;
import com.efscript.script.IBlock;
import com.efscript.script.blocks.expressions.EFSExpressionBlock;
import com.efscript.script.blocks.statements.*;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSStatementBlock<T extends ParserRuleContext> extends ABlock<T> {

	// Create the appropriate block
	public static EFSStatementBlock<?> getAppropriate(StatementContext ctx) throws Exception {
		// Check what kind of context it is
		boolean isBrack = ctx.OPEN_CURLEY() != null;
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
		boolean isExpression = ctx.expression() != null;
		boolean isTIB = ctx.ti_basic_stmt() != null;

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
		if (isExpression) {
			return new EFSExpressionBlock(ctx.expression());
		}
		if(isTIB) {
			return new EFSTiBasicBlock(ctx.ti_basic_stmt());
		}
		if(isBrack) {
			return new EFSBracketBlock(ctx);
		}
		throw new Exception("Unknown statement! Very bad");
	}

	public EFSStatementBlock(T ctx) {
		super(ctx);
	}
}

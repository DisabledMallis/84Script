package com.EFScript.Script;

import com.EFScript.Antlr.EFScriptParser.Dec_stmtContext;
import com.EFScript.Antlr.EFScriptParser.If_stmtContext;
import com.EFScript.Antlr.EFScriptParser.Inc_stmtContext;
import com.EFScript.Antlr.EFScriptParser.StatementContext;
import com.EFScript.Antlr.EFScriptParser.Var_stmtContext;
import com.EFScript.Antlr.EFScriptParser.While_stmtContext;
import com.EFScript.Ti.TiToken;

import org.antlr.v4.runtime.ParserRuleContext;

public class EFSGenStmt {
	public static EFSGenericStmtBlock<?> getAppropriate(ParserRuleContext ctx)
	{
		if(ctx instanceof If_stmtContext)
		{
			return new EFSIfBlock((If_stmtContext)ctx);
		}
		if(ctx instanceof Dec_stmtContext)
		{
			return new EFSDecBlock((Dec_stmtContext)ctx);
		}
		if(ctx instanceof Inc_stmtContext)
		{
			return new EFSIncBlock((Inc_stmtContext)ctx);
		}
		if(ctx instanceof Var_stmtContext)
		{
			return new EFSVarBlock((Var_stmtContext)ctx);
		}
		if(ctx instanceof While_stmtContext)
		{
			return new EFSWhileBlock((While_stmtContext)ctx);
		}
		ctx.assign_stmt();
		ctx.return_stmt();
		ctx.add_assign_stmt();
		ctx.div_assign_stmt();
		ctx.mul_assign_stmt();
		ctx.END_STMT();

		return null;
	}
}

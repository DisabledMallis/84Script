package com.efscript.script;

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
		if(ctx instanceof Assign_stmtContext)
		{
			return new EFSAssignBlock((Assign_stmtContext)ctx);
		}
		if(ctx instanceof Return_stmtContext)
		{
			return new EFSReturnBlock((Return_stmtContext)ctx);
		}
		if(ctx instanceof Add_assign_stmtContext)
		{
			return new EFSAddAssignBlock((Add_assign_stmtContext)ctx);
		}
		if(ctx instanceof Div_assign_stmtContext)
		{
			return new EFSDivAssignBlock((Div_assign_stmtContext)ctx);
		}
		if(ctx instanceof Mul_assign_stmtContext)
		{
			return new EFSMulAssignBlock((Mul_assign_stmtContext)ctx);
		}

		return null;
	}
}

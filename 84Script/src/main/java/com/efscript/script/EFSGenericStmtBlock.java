package com.efscript.script;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSGenericStmtBlock<T extends ParserRuleContext> implements IBlock {

	private T ctx;
	public EFSGenericStmtBlock(T ctx)
	{
		this.ctx = ctx;
	}

	public EFSCompiler currentCompiler()
	{
		return EFSCompiler.currentCompiler();
	}

	public T getCtx()
	{
		return this.ctx;
	}

}

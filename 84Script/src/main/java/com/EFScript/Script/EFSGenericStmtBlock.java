package com.efscript.script;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSGenericStmtBlock<T extends ParserRuleContext> implements IBlock {

	T ctx;
	EFSGenericStmtBlock(T ctx)
	{
		this.ctx = ctx;
	}

	public T getCtx()
	{
		return this.ctx;
	}

}

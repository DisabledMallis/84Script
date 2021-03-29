package com.efscript.script.blocks;

import com.efscript.script.IBlock;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSGenericExpression<T extends ParserRuleContext> implements IBlock {
	// The context
	private T ctx;

	public EFSGenericExpression(T ctx) {
		this.ctx = ctx;
	}

	public T getCtx() {
		return this.ctx;
	}
}

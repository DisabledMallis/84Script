package com.efscript.script;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class ABlock<T extends ParserRuleContext> implements IBlock {
	private T ctx;

	public ABlock(T ctx) {
		this.ctx = ctx;
	}

	public T getCtx() {
		return this.ctx;
	}
}

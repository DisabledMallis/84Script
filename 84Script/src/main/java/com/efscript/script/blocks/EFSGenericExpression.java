package com.efscript.script.blocks;

import com.efscript.script.ABlock;
import com.efscript.script.IBlock;
import com.efscript.script.blocks.expressions.EFSExpressionBlock;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class EFSGenericExpression<T extends ParserRuleContext> extends EFSStatementBlock<T> {
	public EFSGenericExpression(T ctx) {
		super(ctx);
	}
}

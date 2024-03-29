package com.efscript.script.blocks.expressions;

import com.efscript.antlr.EFScriptParser.ExpressionContext;
import com.efscript.antlr.EFScriptParser.MethodcallContext;
import com.efscript.antlr.EFScriptParser.MethodparamsContext;
import com.efscript.script.Context;
import com.efscript.script.blocks.EFSGenericExpression;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

import java.util.List;

public class EFSCallBlock extends EFSGenericExpression<MethodcallContext> {
    public EFSCallBlock(MethodcallContext ctx) {
        super(ctx);
    }

    @Override
    public TiToken[] compile() throws Exception {
        TiCompiler comp = new TiCompiler();

        MethodcallContext ctx = this.getCtx();

        //Push parameters
        MethodparamsContext pCtx = ctx.methodparams();
        List<ExpressionContext> params = pCtx.expression();
		//Should be "[J]([J](1, 5), ", which can then be completed with a number and the required closing bracket(s)
		//The current context stack location should be placed at [J](1,5) BEFORE this param list is accessed
        TiToken[] paramList = {
			TiToken.MATRIX_J,
			TiToken.OPEN_BRACKET,
			TiToken.MATRIX_J,
			TiToken.OPEN_BRACKET,
			TiToken.NUM_1,
			TiToken.COMMA,
			TiToken.NUM_5,
			TiToken.CLOSE_BRACKET,
			TiToken.COMMA
		};

		//Increment [J](1,5) to the new stack loc value
		TiToken[] stackLoc = {
			TiToken.MATRIX_J,
			TiToken.OPEN_BRACKET,
			TiToken.NUM_1,
			TiToken.COMMA,
			TiToken.NUM_5,
			TiToken.CLOSE_BRACKET
		};
		comp.appendInstruction(stackLoc);
		comp.appendInstruction(TiToken.ADD);
		comp.appendInstruction(TiToken.NUM_1);
		comp.appendInstruction(TiToken.STORE);
		comp.appendInstruction(stackLoc);

        for(int i = 0; i < params.size(); i++) {
            ExpressionContext iCtx = params.get(i);
            EFSExpressionBlock exprBlock = new EFSExpressionBlock(iCtx);
            comp.appendInstruction(exprBlock.compile());
            comp.appendInstruction(TiToken.STORE);
            comp.appendInstruction(paramList);
			//The aforementioned number and closing bracket
            comp.appendInstruction(TiToken.getNumber(i + 1));
            comp.appendInstruction(TiToken.CLOSE_BRACKET);
            comp.appendInstruction(TiToken.NEWLINE);
        }

        //Set calling values
        comp.appendInstruction(TiToken.NUM_1);
        comp.appendInstruction(TiToken.STORE);
        comp.appendInstruction(TiToken.LETTER_G);
        comp.appendInstruction(TiToken.NEWLINE);

        String funcName = ctx.identifier().getText();
        int funcId = Context.scriptContext().getFuncID(funcName);
        comp.appendInstruction(TiToken.getNumber(funcId));
        comp.appendInstruction(TiToken.STORE);
        comp.appendInstruction(TiToken.LETTER_F);
        comp.appendInstruction(TiToken.NEWLINE);

        //Call the program again
        String scriptName = Context.scriptContext().getName();
		TiToken[] scriptText = TiToken.convertText(scriptName);
		comp.appendInstruction(TiToken.PRGM);
		comp.appendInstruction(scriptText);
		comp.appendInstruction(TiToken.NEWLINE);

        //The return value
        comp.appendInstruction(TiToken.LETTER_C);

        return comp.getTokens();
    }
}

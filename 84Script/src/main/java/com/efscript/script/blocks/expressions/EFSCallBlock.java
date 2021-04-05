package com.efscript.script.blocks.expressions;

import com.efscript.antlr.EFScriptParser;
import com.efscript.script.blocks.EFSGenericExpression;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiToken;

public class EFSCallBlock extends EFSGenericExpression<EFScriptParser.MethodcallContext> {
    public EFSCallBlock(EFScriptParser.MethodcallContext ctx) {
        super(ctx);
    }

    @Override
    public TiToken[] compile() throws Exception {
        TiCompiler comp = new TiCompiler();

        

        return comp.getTokens();
    }
}

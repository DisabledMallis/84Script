package com.efscript.script.blocks.statements;

import com.efscript.Logger;
import com.efscript.antlr.EFScriptParser;
import com.efscript.script.blocks.EFSStatementBlock;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiPreProcessor;
import com.efscript.ti.TiToken;

public class EFSTiBasicBlock extends EFSStatementBlock<EFScriptParser.Ti_basic_stmtContext> {

    public EFSTiBasicBlock(EFScriptParser.Ti_basic_stmtContext ctx) {
        super(ctx);
    }

    @Override
    public TiToken[] compile() throws Exception {
        String stmtCode = this.getCtx().TI_CODE_BLOCK().getText();
        Logger.Log("STMTCODE: "+stmtCode);
        TiPreProcessor preProcessor = new TiPreProcessor(stmtCode);
        TiCompiler compiler = new TiCompiler(preProcessor.processed());
        return compiler.getTokens();
    }
}

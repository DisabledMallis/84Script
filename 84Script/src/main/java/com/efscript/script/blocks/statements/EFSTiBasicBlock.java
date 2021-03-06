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
        String stmtCode = this.getCtx().any().getText();
        TiPreProcessor preProcessor = new TiPreProcessor(stmtCode);
        String processed = preProcessor.process();
        TiCompiler compiler = new TiCompiler(processed);
        return compiler.getTokens();
    }
}

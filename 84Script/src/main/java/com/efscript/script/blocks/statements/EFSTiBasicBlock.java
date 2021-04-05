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
        Logger.Log("STMT CODE "+stmtCode);
        TiPreProcessor preProcessor = new TiPreProcessor(stmtCode);
        String processed = preProcessor.process();
        Logger.Log("Processed: "+processed);
        TiCompiler compiler = new TiCompiler(processed);
        TiToken[] comped = compiler.getTokens();
        for(TiToken com : comped) {
            if(com == null){
                Logger.Log("WHY IS THIS NULL WTF");
            }
            Logger.Log(com.str);
        }
        return comped;
    }
}

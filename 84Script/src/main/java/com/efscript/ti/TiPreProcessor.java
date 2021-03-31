package com.efscript.ti;

import com.efscript.script.Context;
import com.efscript.script.blocks.EFSVarToken;

//This class is to pre process inline Ti-Basic code
public class TiPreProcessor {
    private Context currentContext;
    private final String code;
    public TiPreProcessor(String code) {
        this.code = code;
    }

    public void setContext(Context currentContext) {
        this.currentContext = currentContext;
    }

    public String processed() throws Exception {
        String processed = code;
        EFSVarToken[] tokes = currentContext.getAsTokens();
        for(EFSVarToken token : tokes) {
            TiCompiler comp = new TiCompiler();
            comp.appendInstruction(token.compile());
            processed = processed.replaceAll(token.toString(), comp.toString());
        }
        return processed;
    }
}

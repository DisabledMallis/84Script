package com.efscript.ti;

import com.efscript.script.Context;
import com.efscript.script.blocks.EFSVarToken;

//This class is to pre process inline Ti-Basic code
public class TiPreProcessor {
    private Context currentContext;
    private final String code;
    public TiPreProcessor(String code) {
        this.code = code;
        setContext(Context.currentContext());
    }

    public void setContext(Context currentContext) {
        this.currentContext = currentContext;
    }

    public String processed() throws Exception {
        String processed = code;
        for(String var : currentContext.getIdentifiers()) {
            TiCompiler comp = new TiCompiler();
            comp.appendInstruction(currentContext.genAccessor(var));
            processed = processed.replaceAll(var.toString(), comp.toString());
        }
        return processed;
    }
}

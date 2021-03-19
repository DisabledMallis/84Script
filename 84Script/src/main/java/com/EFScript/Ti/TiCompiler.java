package com.EFScript.Ti;

import java.util.ArrayList;

import com.EFScript.Logger;

public class TiCompiler {
    ArrayList<TiToken> tokens;
    public TiCompiler()
    {
        tokens = new ArrayList<>();
        Logger.Log("Initialized new TiCompiler...");
    }
	public void appendInstruction(TiToken[] tokens)
	{
		for(TiToken token : tokens)
		{
			appendInstruction(token);
		}
	}
    public void appendInstruction(TiToken token)
    {
        tokens.add(token);
    }
    public TiToken[] getTokens()
    {
        TiToken[] ret = new TiToken[tokens.size()];
        for(int i = 0; i < ret.length; i++)
        {
            ret[i] = tokens.get(i);
        }
        return ret;
    }
    public byte[] compile()
    {
        Logger.Log("Compiling tokens...");
        byte[] compiled = new byte[tokens.size()];
        for(int i = 0; i < compiled.length; i++)
        {
          compiled[i] = tokens.get(i).hex;
        }
        Logger.Log("Tokens compiled");
        return compiled;
    }
}

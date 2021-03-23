package com.EFScript.Script;

import java.util.ArrayList;

import com.EFScript.Antlr.EFScriptParser.FunctionContext;
import com.EFScript.Ti.TiToken;

//A class for compiled & compiling functions
public class EFSFunctionBlock implements IBlock {
	ArrayList<TiToken> tokens;
	public EFSFunctionBlock(FunctionContext ctx)
	{
		tokens = new ArrayList<TiToken>();
		ctx.statement();
	}
	

	@Override
	public TiToken[] compile() {
		TiToken[] arr = new TiToken[tokens.size()];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = tokens.get(i);
		}
		return arr;
	}
}

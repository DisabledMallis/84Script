package com.EFScript.Script;

import java.util.ArrayList;

import com.EFScript.Ti.TiToken;

//A class for compiled & compiling functions
public class EFSFunctionBlock {
	ArrayList<TiToken> tokens;
	public EFSFunctionBlock()
	{
		tokens = new ArrayList<>();
	}

	public TiToken[] getCompiled()
	{
		TiToken[] arr = new TiToken[tokens.size()];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = tokens.get(i);
		}
		return arr;
	}
}

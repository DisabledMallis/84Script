package com.efscript.ti;

import com.efscript.Logger;

public class TiDecompiler {
	byte[] code;

	public TiDecompiler(TiFile source) {
		code = source.programCode;
		Logger.Log("Initialized new TiDecompiler");
	}

	public TiDecompiler(byte[] code) {
		this.code = code;
	}

	public String decompile() {
		Logger.Log("Decompiling tokens...");
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < code.length; i++) {
			TiToken token;
			if(TiToken.isLong(code[i]))
			{
				byte high = code[i];
				i++;
				byte low = code[i];
				token = TiToken.getToken(high, low);
			}
			else{
				token = TiToken.getToken(code[i]);
			}
			build.append(token.str);
		}
		Logger.Log("Decompiled tokens");
		return build.toString();
	}
}
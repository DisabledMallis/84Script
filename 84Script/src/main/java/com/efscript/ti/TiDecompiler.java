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

	//TODO: support 2 byte tokens
	public String decompile() {
		Logger.Log("Decompiling tokens...");
		StringBuilder build = new StringBuilder();
		for (byte c : code) {
			TiToken token = TiToken.getToken(c);
			build.append(token.str);
		}
		Logger.Log("Decompiled tokens");
		return build.toString();
	}
}
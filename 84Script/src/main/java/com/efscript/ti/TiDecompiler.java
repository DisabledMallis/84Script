package com.efscript.ti;

import com.efscript.Logger;

public class TiDecompiler {
	// Bytes for the bytecode
	byte[] code;

	// Decompile a TiFile
	public TiDecompiler(TiFile source) {
		this(source.getProgramCode());
	}

	// Decompile bytecode directly
	public TiDecompiler(byte[] code) {
		this.code = code;
		Logger.Log("Initialized new TiDecompiler");
	}

	// Decompile the bytecode to a string
	public String decompile() {
		Logger.Log("Decompiling tokens...");
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < code.length; i++) {
			TiToken token;
			if (TiToken.isLong(code[i])) {
				byte high = code[i];
				i++;
				byte low = code[i];
				token = TiToken.getToken(high, low);
			} else {
				token = TiToken.getToken(code[i]);
			}
			build.append(token.str);
		}
		Logger.Log("Decompiled tokens");
		return build.toString();
	}
}
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
		// Create a string builder
		StringBuilder build = new StringBuilder();
		// loop through bytes
		for (int i = 0; i < code.length; i++) {
			TiToken token;
			// check if the byte requires a 2nd byte
			if (TiToken.isLong(code[i])) {
				// Get the 2 bytes
				byte high = code[i];
				i++;
				byte low = code[i];
				// Find the token
				token = TiToken.getToken(high, low);
			} else {
				// Otherwise it only needs 1
				// Get the token
				token = TiToken.getToken(code[i]);
			}
			// Return the decompiled code
			build.append(token.str);
		}
		Logger.Log("Decompiled tokens");
		return build.toString();
	}
}
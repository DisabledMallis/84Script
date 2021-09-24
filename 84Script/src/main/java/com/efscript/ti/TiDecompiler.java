package com.efscript.ti;

import com.efscript.Logger;

import java.util.ArrayList;

public class TiDecompiler {
	// Bytes for the bytecode
	byte[] code;

	// DEPRECATED Decompile a TiFile
	//Cant be done with new TiFile format
	/*
	public TiDecompiler(TiFile source) {
		this(source.getProgramCode());
	}
	*/

	// Decompile bytecode directly
	public TiDecompiler(byte[] code) {
		this.code = code;
		Logger.Log("Initialized new TiDecompiler");
	}

	// Decompile the bytecode to a TiToken array
	public TiToken[] decompile() {
		Logger.Log("Decompiling tokens...");
		ArrayList<TiToken> tokens = new ArrayList<>();
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
			tokens.add(token);
		}
		Logger.Log("Decompiled tokens");

		TiToken[] arr = new TiToken[tokens.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = tokens.get(i);
		}
		return arr;
	}
	// Decompile the bytecode to a String
	public String getCode() {
		TiToken[] tokens = this.decompile();
		StringBuilder build = new StringBuilder();
		for(TiToken token : tokens) {
			build.append(token.str);
		}
		return build.toString();
	}
}
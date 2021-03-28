package com.efscript.ti;

import java.util.ArrayList;

import com.efscript.Logger;

public class TiCompiler {
	// List for tokens
	ArrayList<TiToken> tokens;

	public TiCompiler() {
		tokens = new ArrayList<>();
		Logger.Log("Initialized new TiCompiler...");
	}

	// Append a collection of tokens
	public void appendInstruction(TiToken[] tokens) {
		for (TiToken token : tokens) {
			appendInstruction(token);
		}
	}

	// Append a single token
	public void appendInstruction(TiToken token) {
		tokens.add(token);
	}

	// Get the tokens (not compiled)
	public TiToken[] getTokens() {
		TiToken[] ret = new TiToken[tokens.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = tokens.get(i);
		}
		return ret;
	}

	// Compile tokens to bytecode
	public byte[] compile() {
		Logger.Log("Compiling tokens...");
		// Calculate the size
		int size = 0;
		for (TiToken token : tokens) {
			size += token.length;
		}
		// Allocate a byte array of size
		byte[] compiled = new byte[size];
		// Compensate for jumped bytes
		int jumped = 0;
		// Loop through
		for (int i = 0; i < compiled.length; i++) {
			// Get the current token
			TiToken current = tokens.get(i - jumped);
			// Set the first byte
			compiled[i] = current.hex_high;
			// Check for a second byte
			if (current.length > 1) {
				// Set the second byte
				i++;
				jumped++;
				compiled[i] = current.hex_low;
			}
		}
		// Done
		Logger.Log("Tokens compiled");
		return compiled;
	}
}

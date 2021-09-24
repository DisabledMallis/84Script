package com.efscript.ti;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.efscript.ti.VariableEntry;

public class VariableData {
	short tokenCount = 0;
	byte[] data;

	public VariableData(TiToken[] tokens) {
		TiCompiler comp = new TiCompiler();
		comp.appendInstruction(tokens);
		this.tokenCount = (short)comp.getTokens().length;
		this.data = comp.compile();
	}

	public byte[] pack() throws IOException {
		assert(data != null);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream finalBytes = new DataOutputStream(baos);

		finalBytes.writeShort(tokenCount);
		finalBytes.write(data);

		return baos.toByteArray();
	}
}
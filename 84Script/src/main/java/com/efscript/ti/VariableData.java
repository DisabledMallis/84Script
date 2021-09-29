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
	short dataSize = 0;
	byte[] data;

	public VariableData(TiToken[] tokens) {
		TiCompiler comp = new TiCompiler();
		comp.appendInstruction(tokens);
		this.dataSize = (short)comp.compile().length;
		this.data = comp.compile();
	}

	public byte[] pack() {
		ByteArray array = new ByteArray();

		array.add(dataSize);
		array.add(data);

		return array.toPrimitiveArray();
	}
}
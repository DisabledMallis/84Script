package com.efscript.ti;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.efscript.ti.VariableData;

public class VariableEntry {
	

	byte[] offset_0 = {0x0, 0xB};
	short varLength = 0x0;
	byte varType = 0x5;
	String name = "";
	byte version = 0x0;
	byte archived = 0x0;
	VariableData varData;

	public VariableEntry(String name, VariableData varData) {
		assert(name.length() == 8);
		this.varLength = (short)varData.pack().length;
		this.name = name;
		this.varData = varData;

	}

	public byte[] pack() {
		assert(name.length() == 8);

		ByteArray array = new ByteArray();

		array.add(offset_0);
		array.add(varLength);
		array.add(varType);
		array.add(name, 8);
		array.add(version);
		array.add(archived);
		array.add(varLength);
		array.add(varData.pack());
		
		return array.toPrimitiveArray();
	}
}
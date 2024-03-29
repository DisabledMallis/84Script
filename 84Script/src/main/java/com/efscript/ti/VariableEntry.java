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
	

	byte[] offset_0 = {0xD,0x0};
	short varLength = 0x0;
	byte varType = 0x5;
	String name = "";
	byte version = 0x0;
	byte archived = 0x0;
	VariableData varData;

	public VariableEntry(String name, VariableData varData) {
		this.varLength = (short)varData.pack().length;
		this.name = name;
		this.varData = varData;

	}

	public byte[] pack() {
		ByteArray array = new ByteArray();

		array.add(offset_0);
		array.add(varLength);
		array.addByte(varType);
		array.add(name, 8);
		array.addByte(version);
		array.addByte(archived);
		array.add(varLength);
		array.add(varData.pack());
		
		return array.toPrimitiveArray();
	}
}
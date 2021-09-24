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
	

	byte[] offset_0 = {0xB, 0x0};
	short varLength = 0x0;
	byte varType = 0x5;
	byte[] name = {'\0','\0','\0','\0',
					'\0','\0','\0','\0'};
	byte version = 0x0;
	byte archived = 0x0;
	short length = 0x0;
	VariableData varData;

	public VariableEntry(byte[] name, VariableData varData) throws IOException{
		assert(name.length == 8);
		this.varLength = (short)varData.pack().length;
		this.name = name;
		this.length = this.varLength;
		this.varData = varData;

	}

	public byte[] pack() throws IOException {
		assert(name.length == 8);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream finalBytes = new DataOutputStream(baos);

		finalBytes.write(offset_0);
		finalBytes.writeShort(varLength);
		finalBytes.writeByte(varType);
		finalBytes.write(name);
		finalBytes.writeByte(version);
		finalBytes.writeByte(archived);
		finalBytes.writeShort(length);
		finalBytes.write(varData.pack());
		
		return baos.toByteArray();
	}
}
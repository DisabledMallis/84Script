package com.efscript.ti;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import com.efscript.Logger;
import com.efscript.ti.VariableEntry;
import com.efscript.ti.VariableData;

public class TiFile {

	byte[] fileSignature = {'*', '*', 'T', 'I', '8', '3', 'F', '*', 0x1A, 0xA, 0xA};
	String comment = "Compiled with DisabledMallis/84Script";
	short dataLength = 0;
	VariableEntry[] dataSection = {};
	short checksum = 0;

	public TiFile() {
		dataLength = -0x39;
		dataLength += fileSignature.length;
		dataLength += comment.length();
		dataLength += 2; //Include itself in the filesize

		dataSection = new VariableEntry[0];
	}
	public TiFile(String name, TiToken[] tokens) {
		this();
		VariableData data = new VariableData(tokens);
		VariableEntry entry = new VariableEntry(name, data);
		this.pushVariableEntry(entry);
	}

	public void pushVariableEntry(VariableEntry newEntry) {
		VariableEntry[] entries = new VariableEntry[dataSection.length+1];
		for(int i = 0; i < dataSection.length; i++) {
			dataLength += dataSection[i].pack().length;
			entries[i] = dataSection[i];
		}
		entries[entries.length-1] = newEntry;
		dataSection = entries;
	}

	public byte[] pack() {
		ByteArray array = new ByteArray();
		array.add(this.fileSignature);
		array.add(this.comment, 42);
		array.add(dataLength);
		
		ByteArray varEntryArray = new ByteArray();
		for(VariableEntry entry : dataSection) {
			varEntryArray.add(entry.pack());
		}
		long l_checksum = 0;//0x100;
		for(byte b : varEntryArray.toPrimitiveArray()){
			l_checksum += b;
		}
		short checksum = (short)l_checksum;

		array.add(varEntryArray.toPrimitiveArray());
		array.add(checksum);

		//We need to adjust the size, my previous size calculations are wrong.
		byte[] preFinal = array.toPrimitiveArray();
		short fullSize = (short)preFinal.length;
		fullSize -= 0x39; //The docs said to do this, dont ask me
		ByteArray converter = new ByteArray();
		converter.add(fullSize);
		preFinal[0x35] = converter.toPrimitiveArray()[0];
		preFinal[0x36] = converter.toPrimitiveArray()[1];

		return preFinal;
	}
}

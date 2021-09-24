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
	byte[] comment = {'C', 'o', 'm', 'p', 'i', 'l', 'e', 'd', ' ', 'w', 'i', 't', 'h', ' ', 'D', 'i', 's', 'a', 'b', 'l', 'e', 'd', 'M', 'a', 'l', 'l', 'i', 's', '/', '8', '4', 'S', 'c', 'r', 'i', 'p', 't', 0x0, 0x0, 0x0, 0x0, 0x0};
	short dataLength = 0;
	VariableEntry[] dataSection = {};
	short checksum = 0;

	public TiFile() {
		dataLength = -0x39;
		dataLength += fileSignature.length;
		dataLength += comment.length;
		dataLength += 2; //Include itself in the filesize

		dataSection = new VariableEntry[0];
	}
	public TiFile(String name, TiToken[] tokens) throws IOException {
		VariableData data = new VariableData(tokens);
		VariableEntry entry = new VariableEntry(name.getBytes(StandardCharsets.US_ASCII), data);
		this.pushVariableEntry(entry);
	}

	public void pushVariableEntry(VariableEntry newEntry) throws IOException {
		VariableEntry[] entries = new VariableEntry[dataSection.length+1];
		for(int i = 0; i < dataSection.length; i++) {
			dataLength += dataSection[i].pack().length;
			entries[i] = dataSection[i];
		}
		entries[entries.length-1] = newEntry;
		dataSection = entries;
	}

	public byte[] pack() throws IOException {
		assert(dataSection != null);
		assert(dataSection.length != 0);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream finalBytes = new DataOutputStream(baos);
		finalBytes.write(this.fileSignature);
		finalBytes.write(this.comment);
		finalBytes.writeShort(dataLength);
		
		ByteArrayOutputStream data_baos = new ByteArrayOutputStream();
		DataOutputStream dataBytes = new DataOutputStream(data_baos);
		for(VariableEntry entry : dataSection) {
			dataBytes.write(entry.pack());
		}
		long l_checksum = 0;
		for(byte b : data_baos.toByteArray()){
			l_checksum += b;
		}
		short checksum = (short)l_checksum;

		finalBytes.write(data_baos.toByteArray());
		finalBytes.writeShort(checksum);

		return baos.toByteArray();
	}
}

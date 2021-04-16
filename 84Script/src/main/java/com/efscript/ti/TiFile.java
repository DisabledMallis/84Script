package com.efscript.ti;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.efscript.Logger;

public class TiFile {
	byte[] fileHeader; // 8 bytes
	private final int FILE_HEADER_SIZE = 8;
	/* 3 Bytes */
	byte[] fileDescriptor; // 40 bytes
	private final int FILE_DESCRIPTOR_SIZE = 40;
	/* 3 Bytes */
	byte[] nameMeta; // 4 bytes
	private final int META_SIZE = 4;
	byte[] programName; // 9 bytes
	private final int PROG_NAME_SIZE = 9;
	byte[] codeMeta; // 4 bytes
	/* 1 Byte */
	byte[] programCode; // Flexible
	/* 2 Bytes */
	byte[] checksum; // 2 byte
	/* EOF */

	// Generate a new file
	public TiFile(String fileDescriptor, String programName, byte[] programCode) {
		Logger.Log("Initialized new TiFile from scratch");
		// Set necessary values
		this.fileHeader = "**TI83F*".getBytes(Charset.forName("ASCII"));
		this.fileDescriptor = fileDescriptor.getBytes(Charset.forName("ASCII"));
		this.programName = programName.getBytes(Charset.forName("ASCII"));
		this.nameMeta = new byte[4];
		this.codeMeta = new byte[4];
		this.setProgramCode(programCode);

	}

	// Read an existing file
	public TiFile(String path) throws Exception {
		Logger.Log("Reading existing .8xp file \"" + path + "\"");
		// Read bytes of existing file
		FileInputStream fileStream = new FileInputStream(path);
		fileHeader = fileStream.readNBytes(8);
		fileStream.skip(3);
		fileDescriptor = fileStream.readNBytes(40);
		fileStream.skip(3);
		fileStream.skip(2); // These are the query bytes, they are always 0x0 and 0x5.
		nameMeta = fileStream.readNBytes(4);
		programName = fileStream.readNBytes(9);
		codeMeta = fileStream.readNBytes(4);
		fileStream.skip(1);
		byte len = codeMeta[3];
		programCode = fileStream.readNBytes(len);
		fileStream.skip(1);
		checksum = fileStream.readNBytes(2);
		fileStream.close();
	}

	public String getFileHeader() {
		return new String(fileHeader);
	}

	public String getFileDescriptor() {
		return new String(fileDescriptor);
	}

	public void setFileDescriptor(String descriptor) {
		fileDescriptor = new byte[40];
		byte[] strBytes = descriptor.getBytes(Charset.forName("ASCII"));
		for (int i = 0; i < strBytes.length; i++) {
			fileDescriptor[i] = strBytes[i];
		}
	}

	public String getProgramName() {
		return new String(programName);
	}

	public int getFullCodeSizeFromCodeMeta() {
		return codeMeta[1];
	}

	public int getCodeSizeFromCodeMeta() {
		return codeMeta[3];
	}

	public byte[] getProgramCode() {
		return programCode;
	}

	public void setProgramCode(byte[] byteCode) {
		// Set the metadata lenghts
		nameMeta[3] = (byte) (byteCode.length + 2);
		nameMeta[1] = (byte) byteCode.length;
		codeMeta[1] = (byte) (byteCode.length + 2);
		codeMeta[3] = (byte) byteCode.length;

		programCode = byteCode;
	}

	public byte[] getChecksum() {

		long sum = 0;

		sum += 0x0D;
		sum += (programCode.length+2)*2;
		sum += (programCode.length+2 >> 8)*2;
		sum += 0x05;
		sum += 0x04;
		for(byte b : programName) {
			sum += b;
		}

		byte[] code = getProgramCode();
		for(byte b : code) {
			sum += b;
		}

		short value = (short)(sum & 0xFFFF);
		ByteBuffer buffer = ByteBuffer.allocate(Short.BYTES);
		buffer.putShort(value);
		return buffer.array();
	}



	public byte[] generateNew() {
		Logger.Log("Generating new .8xp file");

		checksum = getChecksum();

		ArrayList<Byte> bytes = new ArrayList<>();
		// Add file header
		for (int i = 0; i < FILE_HEADER_SIZE; i++) {
			if (this.fileHeader.length <= i)
				bytes.add((byte) 0);
			else
				bytes.add(this.fileHeader[i]);
		}
		// Pad 3 bytes
		for (byte b = 0; b < 3; b++) {
			bytes.add((byte) 0);
		}
		// Add file descriptor
		for (int i = 0; i < FILE_DESCRIPTOR_SIZE; i++) {
			if (this.fileDescriptor.length <= i)
				bytes.add((byte) 0);
			else
				bytes.add(this.fileDescriptor[i]);
		}
		// Pad 3 bytes
		for (byte b = 0; b < 3; b++) {
			bytes.add((byte) 0);
		}
		// Add name metadata
		for (int i = 0; i < META_SIZE; i++) {
			if (this.nameMeta.length <= i)
				bytes.add((byte) 0);
			else
				bytes.add(this.nameMeta[i]);
		}

		bytes.add((byte)(programCode.length >> 8));
		bytes.add((byte)0x5);

		// Add program name
		for (int i = 0; i < PROG_NAME_SIZE; i++) {
			if (this.programName.length <= i)
				bytes.add((byte) 0);
			else
				bytes.add(this.programName[i]);
		}
		// Add code meta
		for (int i = 0; i < META_SIZE; i++) {
			bytes.add(codeMeta[i]);
		}
		// Pad 1 byte
		for (byte b = 0; b < 1; b++) {
			bytes.add((byte) 0);
		}
		// Add program code
		for (byte b : programCode) {
			bytes.add(b);
		}
		// Add checksum
		for (byte b : checksum) {
			bytes.add(b);
		}

		// Get array from arraylist
		byte[] prim = new byte[bytes.size()];
		for (int i = 0; i < prim.length; i++) {
			prim[i] = bytes.get(i);
		}
		Logger.Log("Generated new .8xp file");
		return prim;
	}

	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append("{'TiFile': ");
		build.append("FileHeader:[");
		for (byte b : fileHeader) {
			build.append(b + " ");
		}
		build.append("], ");
		build.append("FileDesc:[");
		for (byte b : fileDescriptor) {
			build.append(b + " ");
		}
		build.append("], ");
		build.append("NameMeta:[");
		for (byte b : nameMeta) {
			build.append(b + " ");
		}
		build.append("], ");
		build.append("ProgName:[");
		for (byte b : programName) {
			build.append(b + " ");
		}
		build.append("], ");
		build.append("CodeMeta:[");
		for (byte b : codeMeta) {
			build.append(b + " ");
		}
		build.append("], ");
		build.append("Code:[");
		for (byte b : programCode) {
			build.append(b + " ");
		}
		build.append("], ");
		build.append("Checksum:[");
		build.append("" + checksum);
		build.append("]");
		build.append("}");
		return build.toString();
	}
}

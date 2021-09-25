package com.efscript.ti;

import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public class ByteArray extends ArrayList<Byte> {
	public Byte[] toArray() {
		return this.toArray();
	}
	public byte[] toPrimitiveArray() {
		byte[] arr = new byte[this.size()];
		for(int i = 0; i < this.size(); i++) {
			arr[i] = this.get(i);
		}
		return arr;
	}

	public void add(byte[] bytes) {
		for(byte b : bytes) {
			super.add(b);
		}
	}

	public void add(short value) {
		ByteBuffer buffer = ByteBuffer.allocate(2);
		buffer.putShort(value);
		byte[] bytes = new byte[2];
		bytes[0] = buffer.array()[0];
		bytes[1] = buffer.array()[1];
		this.add(bytes);
	}

	public void add(String text) {
		this.add(text, StandardCharsets.US_ASCII, text.length());
	}
	public void add(String text, int expectedLength) {
		expectedLength--; //Cuz shit starts at 0 and whatever
		this.add(text, StandardCharsets.US_ASCII, expectedLength);
	}
	public void add(String text, Charset charSet, int expectedLength) {
		byte[] newArr = new byte[expectedLength];
		byte[] textBytes = text.getBytes(charSet);
		for(int i = 0; i < expectedLength; i++) {
			if(i >= textBytes.length) {
				newArr[i] = 0x0;
				continue;
			}
			newArr[i] = textBytes[i];
		}
		this.add(newArr);
	}
}

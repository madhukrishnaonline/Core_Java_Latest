package com.string.operations;

import java.nio.charset.StandardCharsets;

public class StringByteArrayViceVersa {
	public static byte[] stringToByteArray(String str) {
		byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
		return bytes;
	}
	
	public static String byteArrayToString(byte[] arr) {
//		byte[] bytes = arr;
		String str = new String(arr,StandardCharsets.UTF_8);
		return str;
	}
	

	public static void main(String[] args) {
		byte[] toByteArray = stringToByteArray("Madhu");
		for(byte b:toByteArray) {
			System.out.print(b+" ");
		}
		
		String byteArrayToString = byteArrayToString(toByteArray);
		System.out.println(byteArrayToString);
	}

}

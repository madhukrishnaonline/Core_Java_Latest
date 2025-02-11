package com.string.operations;

public class StringToCharArrayViceVersa {

	public static void main(String[] args) {
		String str = "Madhu";
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		String string = new String(charArray, 2, 3);
		System.out.println(string);
	}

}

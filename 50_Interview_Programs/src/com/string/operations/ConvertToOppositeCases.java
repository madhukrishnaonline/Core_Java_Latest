package com.string.operations;

public class ConvertToOppositeCases {
	private static String convertToOppositeCases(String str) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				builder.append((char) (ch - 32));
			} // if
			else if (ch >= 65 && ch <= 91) {
				builder.append((char) (ch + 32));
			} // else if
			else if (ch >= 48 && ch <= 57) {
				int num = Character.getNumericValue(ch);
				builder.append(num);
			} // else if
			else {
				builder.append(ch);
			} // else
		} // for
		return builder.toString();
	}

	private static String convertToOppositeCasesAndAddNumbers(String str) {
		StringBuilder builder = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				builder.append((char) (ch - 32));
				sum=0;
			} // if
			else if (ch >= 65 && ch <= 90) {
				builder.append((char) (ch + 32));
				sum=0;
			} // else if
			else if (ch >= 48 && ch <= 57) {
				builder.append(ch); //append the number
				char lastChar = builder.charAt(builder.length()-1); //get the last number as char
				int value = Character.getNumericValue(lastChar); //convert it to value
				sum += value; //summing
				builder.insert(builder.length()-1, sum);
			} // else if
			else {
				builder.append(ch);
				sum=0;
			} // else
		} // for
		return builder.toString();
	}

	public static void main(String[] args) {
		String str = "abc123EfG";
		System.out.println(convertToOppositeCases(str));
		System.out.println(convertToOppositeCasesAndAddNumbers(str));
	}// main
}// class
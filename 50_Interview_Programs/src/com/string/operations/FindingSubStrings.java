package com.string.operations;

public class FindingSubStrings {
	public static void main(String[] args) {
		String str = "madhu";
		int len = str.length();
		for (int i = 0; i <= len; i++) {
			for (int j = i + 1; j <= len; j++) {
				System.out.println(str.substring(i, j));
			} // inner loop
		} // outer loop
		System.out.println(len*(len+1)/2);
	}// main
}// class
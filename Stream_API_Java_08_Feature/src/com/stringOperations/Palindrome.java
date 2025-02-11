package com.stringOperations;

import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		int back = str.length() - 1;
		boolean allMatch = IntStream.range(0, str.length()).allMatch(front -> str.charAt(front) == str.charAt(back - front));
		if (allMatch) {
			System.out.println("Palindrom String");
		} // if
	}// main
}// class
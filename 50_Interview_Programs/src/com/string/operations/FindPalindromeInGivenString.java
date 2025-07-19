package com.string.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FindPalindromeInGivenString {

	static List<String> printPalindromes(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		List<String> list = new ArrayList<>();
		while (tokenizer.hasMoreElements()) {
			StringBuilder builder = new StringBuilder();
			String nextToken = tokenizer.nextToken();
			builder.append(nextToken);
			String reverse = builder.reverse().toString();
			if (nextToken.equalsIgnoreCase(reverse)) {
				list.add(nextToken);
			} // if
//			builder.setLength(0);
		} // while
		return list;
	}// printPalindromes

	public static void main(String[] args) {
		String str = "My Amma will be here in Five minutes Mam";
		printPalindromes(str).forEach(System.out::println);
	}// main
}// class
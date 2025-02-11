package com.string.operations;

import java.util.StringTokenizer;

public class ReverseTheOrder {
	private static String reverseOrder(String str) {
		StringBuilder builder = new StringBuilder();
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			builder.append(arr[i] + " ");
		} // for
		return builder.toString().trim();
	}

	private static String reverseTheWordsInPlace(String str) {
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		while (tokenizer.hasMoreTokens()) {
			StringBuilder builder1 = new StringBuilder();
			builder1.append(tokenizer.nextToken()).reverse();
			builder.append(builder1+" ");
		} // while
		return builder.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(reverseOrder("Java Programming Language"));
		System.out.println(reverseTheWordsInPlace("Java Programming Language"));
	}

}

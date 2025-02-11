package com.stringOperations;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ReverseUsingLambda {
	public static void main(String[] args) {
		String str = "Madhu Krishna";
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
//		int count = tokenizer.countTokens();
		/*	for (int i = str.length() - 1; i >= 0; i--) {
				char ch = str.charAt(i);
				System.out.print(ch);
			} // for
		*/
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringBuilder builder = new StringBuilder(token);
			StringBuilder reverse = builder.reverse();
			System.out.print(reverse+" ");
		} // while
		
		System.out.println("\nUsing Lambda");
		Arrays.stream(str.split(" ")).forEach(word->{
			System.out.print(new StringBuilder(word).reverse()+" ");
		});
		
//		Arrays.stream()
	}// main
}// class
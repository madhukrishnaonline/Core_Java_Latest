package com.accenture.coding;

import java.util.Scanner;

public class FirstLetterMiddleCountLastLetter {

	public static String getFirstMiddleCountLast(String str) {
		/*Q.Shorten Word with Middle Character Count
		 *  ->Problem Statement:
		 *     Given a word, return a string that contains the first letter, the count of the middle characters, and the last letter.
		 */
		StringBuilder builder = new StringBuilder();
		StringBuilder middleChars = new StringBuilder();
		builder.append(str.charAt(0));
		for (int i = 1; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if(ch==' ') {
				//skip the loop
				continue;
			}//if
			middleChars.append(String.valueOf(ch));
		} // for
		builder.append(middleChars.length());
		builder.append(str.charAt(str.length() - 1));
		return builder.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Word");
		String str = scanner.nextLine();
		System.out.println(getFirstMiddleCountLast(str));
		scanner.close();
	}// main
}

package com.mk.interview;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String"); // mam
		String str = sc.nextLine().toLowerCase();
		int count = 0, alphabets = 0, numbers = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = (char) str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				alphabets++;
				switch (ch) {
				case 'a' -> count++;
				case 'e' -> count++;
				case 'i' -> count++;
				case 'o' -> count++;
				case 'u' -> count++;
//				default -> consonants++;
				}// if
			} // switch
			if (ch >= 48 && ch <= 57) {
				numbers++;
			}
		} // for
		System.out.println("Count of Vowels :: " + count);
		System.out.println("Consonants :: " +(alphabets-count));
//		System.out.println("Alphabets :: "+alphabets);
		System.out.println("Numbers :: " + numbers);
		
		var fullName = str;
		fullName = "krishna";
		System.out.println(fullName);
		sc.close();
	}// main
}

package com.string.operations;

import java.util.Scanner;

public class CountAllChars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine().toLowerCase();
		int len = str.length();
		int vowels = 0, alphabets = 0, numbers = 0;
		for (int i = 0; i < len - 1; i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a' -> vowels++;
			case 'e' -> vowels++;
			case 'i' -> vowels++;
			case 'o' -> vowels++;
			case 'u' -> vowels++;
			}// switch
			int p = (int) ch;
			/*if (p >= 65 && p <= 90) {
				alphabets++;
			} // if
			*/
			if (p >= 97 && p <= 122) {
				alphabets++;
			} // if
			if (p >= 48 && p <= 57) {
				numbers++;
			} // if
		} // for
		System.out.println("Alphabets :: " + alphabets);
		System.out.println("Vowels :: " + vowels);
		System.out.println("Consonants :: " + (alphabets - vowels));
		System.out.println("Numbers :: " + numbers);
		System.out.println("Others :: "+(len-(alphabets+numbers)));
		scanner.close();
	}// main
}// class
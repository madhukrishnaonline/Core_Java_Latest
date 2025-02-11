package com.string.operations;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String str = scanner.nextLine();
		int len = str.length();
		int f = 0;
		int b = len - 1;
		for (int i = 0; i <= len - 1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(b);
			if (ch1 == ch2) {
				f++;
			} // if
			b--;
		} // for
		if (f == len) {
			System.out.println("Palindrome String....");
		} // if
		else {
			System.out.println("Not a Palindrome...");
		} // else
		scanner.close();
	}// main
}// class
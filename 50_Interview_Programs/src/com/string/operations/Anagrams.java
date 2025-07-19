package com.string.operations;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] chArr1 = str1.toCharArray();
		char[] chArr2 = str2.toCharArray();
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		return Arrays.equals(chArr1, chArr2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String");
		String str2 = sc.nextLine();
		if (isAnagram(str1, str2)) {
			System.out.println("the given Strings are Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}

		sc.close();
	}

}

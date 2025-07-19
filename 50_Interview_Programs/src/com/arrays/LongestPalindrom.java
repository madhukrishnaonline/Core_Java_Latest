package com.arrays;

public class LongestPalindrom {

	public static void main(String[] args) {
		String[] arr = { "mam", "mama", "sarigamagiras", "detartrated", "redivider", "geeksskeeg", "malayalam" };

		int max = 0;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i].trim();
			StringBuilder builder = new StringBuilder(word);
			String reverse = builder.reverse().toString();
			if (word.equalsIgnoreCase(reverse) && max < word.length()) {
				max = word.length();
				index = i;
			}
		}
		if (index != -1) {
			System.out.println(arr[index]);
		}else {
			System.out.println("No Palindrome Found");
		}
	}
}
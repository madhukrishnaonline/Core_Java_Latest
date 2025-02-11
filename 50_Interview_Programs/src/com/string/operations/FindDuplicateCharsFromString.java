package com.string.operations;

public class FindDuplicateCharsFromString {

	public static void findDuplicates(String str) {
		int[] freq = new int[256]; // Frequency array to count occurrences of each character

		// Traverse the string and update the frequency array
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}//for

		System.out.println("Duplicate characters in the string are:");

		// Traverse the frequency array to find characters with frequency greater than 1
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 1) {
				System.out.println((char) i + " occurs " + freq[i] + " times");
			}//if
		}//for
	}

	public static void main(String[] args) {
		String str = "madmax";
		findDuplicates(str);

		/*Map<String,Long> map = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.entrySet().stream().filter(k->k.getValue()>1).map(key->key.getKey()).forEach(System.out::println);*/

	}// main
}// class
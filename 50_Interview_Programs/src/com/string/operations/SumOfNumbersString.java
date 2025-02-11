package com.string.operations;

import java.util.Scanner;

public class SumOfNumbersString {
	private static String productOfTwoNumbersInTwoStrings(String num1, String num2) {
		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);

		int product = int1 * int2;
		return String.valueOf(product);
	}

	private static void sumOfTwoNumbers(String str) {
//		int len = str.length();
		int sum = 0;
//		System.out.println("Count of Vowels :: "+count);
		for (char i : str.toCharArray()) {
//			System.out.println(i);
			if (i >= 48 && i <= 57) {
				sum = sum + Integer.parseInt(String.valueOf(i));
			} // if
		} // for
		if(sum!=0) {
		System.out.println("Sum of Numbers :: " + sum);
		}else {
			System.out.println("No Numbers are presented");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :: ");
		String str = scanner.nextLine();
		String vowels  = "aeiouAEIOU";
		str.chars().mapToObj(c->(char)c).filter(ch->vowels.indexOf(ch)!=-1).forEach(System.out::println);
		sumOfTwoNumbers(str);
		scanner.close();
		
		String product = productOfTwoNumbersInTwoStrings("123","555");
		System.out.println(product);

	}// main
}// class
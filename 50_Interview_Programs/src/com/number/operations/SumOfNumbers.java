package com.number.operations;

public class SumOfNumbers {
	public static Integer sumOfInteger(Integer num) {
		if (num == 0) {
			return 0;
		} // if
		int lastDigit = num % 10;
		int sumOfDigits = sumOfInteger(num / 10);
		return lastDigit + sumOfDigits;
	}

	private static boolean isSumOfEvenEqualToOdd(int num) {
		String str = String.valueOf(num);
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((i + 1) % 2 != 0) {
				oddSum += Character.getNumericValue(ch);
			} // if
			else {
				evenSum += Character.getNumericValue(ch);
			} // else
		} // for
		if (oddSum == evenSum) {
			return true;
		} // if
		return false;
	}

	public static void main(String[] args) {
		Integer sumOfInteger = sumOfInteger(111);
		System.out.println(sumOfInteger);
		
		System.out.println(isSumOfEvenEqualToOdd(2344));
		/*int num1 = 41;
		String str = String.valueOf(num1);
		int sum1 = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			sum1 += Character.getNumericValue(ch);
		} // for
		System.out.println(sum1);*/

		/*	int num = 46;
			int sum = 0;
			while (num != 0) {
				int last = num % 10;
				sum += last;
				num /= 10;
			} // for
			System.out.println(sum);*/
	}// main
}
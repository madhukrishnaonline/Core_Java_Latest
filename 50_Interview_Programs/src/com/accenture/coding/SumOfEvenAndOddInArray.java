package com.accenture.coding;

import java.util.Arrays;

public class SumOfEvenAndOddInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		int evenSum = Arrays.stream(arr).filter(even -> even % 2 == 0).reduce(0, (a, b) -> a + b);
		System.out.println("Sum Of Even Numbers :: " + evenSum);

		int oddSum = Arrays.stream(arr).filter(even -> even % 2 == 1).reduce(0, (a, b) -> a + b);
		System.out.println("Sum of Odd Numbers :: " + oddSum);
	}

}

package com.accenture.coding;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SecondSmallNoInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 3, 1, 5 };
		/*	int small = Arrays.stream(arr).min().getAsInt();
			System.out.println(small);*/

		OptionalInt smallest = IntStream.of(arr).min();

		// Step 2: Find the second smallest by filtering out the smallest number
		if (smallest.isPresent()) {
			OptionalInt secondSmallest = IntStream.of(arr).filter(num -> num != smallest.getAsInt()).min();
			System.out.println(secondSmallest.getAsInt());
		} // if
	}// main
}// class
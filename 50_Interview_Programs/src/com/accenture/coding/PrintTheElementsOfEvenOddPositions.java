package com.accenture.coding;

public class PrintTheElementsOfEvenOddPositions {
	/*
	 * Q.Reverse the Array and Print Odd and Even Positions
	 *  =>Problem Statement:
	 *   Reverse the given array and then print the elements at even and odd positions in a string format.
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 3, 1, 9, 5, 6, 7 };

		StringBuilder evenPositions = new StringBuilder();
		StringBuilder oddPositions = new StringBuilder();

		for (int i = arr.length - 1; i >= 0; i--) {
			int position = arr.length - i;
			if (position % 2 == 0) {
				evenPositions.append(arr[i]).append(" ");
			} // if
			else {
				oddPositions.append(arr[i]).append(" ");
			} // if
		} // for
		System.out.println(evenPositions.toString());
		System.out.println(oddPositions.toString());

	}// main
}// class

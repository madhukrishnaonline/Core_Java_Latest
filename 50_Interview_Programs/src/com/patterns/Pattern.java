package com.patterns;

public class Pattern {
	// public static void printPattern(int n) {

	/*for (int i = n; i >= 1; i--) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}//inner loop
		System.out.println();
	}//outer loop
	
	for (int i = 2; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}//inner loop
		System.out.println();
	}//outer loop
	}//method
	*/
	public static void main(String[] args) {
//		int n = 10;
		// printPattern(n);
		int rows = 23;
		int columns = 50;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				// Print * for the first and last rows, or for the first and last columns
				if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}//else
			}
			System.out.println();
		}
//      **
//      **
	}// main
}// class
package com.patterns.stars;

public class SquareTriangle {
	public static void squarePattern(int rows) {
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= rows; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void hollowSquarePattern(int rows) {
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= rows; col++) {
				if (row == 1 || col == 1 || row == rows || col == rows) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int rows = 5;
		squarePattern(rows);
		System.out.println("==================");
		hollowSquarePattern(rows);
	}
}
/*
================
 Square Triangle
  * * * * *
  *       *
  *       *
  *       *
  * * * * *
================

*/
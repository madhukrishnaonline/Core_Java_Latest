package com.patterns.numbers;

public class Temp {
	/*
	1.incrementing triangle
	2.incrementing rows
	1
	22
	333
	4444
	55555
	 */
	public static void incrementingTriangleRows(int rows) {
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}

	/*
	 
	 0
	 22
	 444
	 6666
	 88888 
	 */

	public static void incrementTriangleEvenNums(int rows) {
		for (int row = 1, e = 0; row <= rows; row++, e += 2) {
			for (int col = 1; col <= row; col++) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	/*
	 1
	 22
	 111
	 2222
	 11111
	 */
	public static void incrementTriangleNums(int rows) {
		int num = 1;
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(num + " ");
			}
			if (num == 2) {
				num--;
			} else {
				num++;
			}
			System.out.println();
		}
	}

	/*
	      Diamond Pattern
	                  1 
			        2 2 2 
			      3 3 3 3 3 
			    4 4 4 4 4 4 4 
			  5 5 5 5 5 5 5 5 5 
			    6 6 6 6 6 6 6 
			      7 7 7 7 7 
			        8 8 8 
			          9 
	 */
	public static void incrementNumsDiamondPattern(int rows) {
		int num=1;
		for (int row = 1; row < rows; row++) {
			for (int space = row; space <= rows; space++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(num + " ");
			}
			for (int col = 1; col < row; col++) {
				System.out.print(num + " ");
			}
			num++;
			System.out.println();
		}
		//second half
		for (int row = 1; row <= rows; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col <= rows; col++) {
				System.out.print(num+ " ");
			}
			for (int col = row; col < rows; col++) {
				System.out.print(num+ " ");
			}
			num++;
			System.out.println();
		}
		

	}

	public static void main(String[] args) {
		int rows = 5;
		incrementingTriangleRows(rows);
		System.out.println("==============");
		incrementTriangleEvenNums(rows);
		System.out.println("==============");
		incrementTriangleNums(rows);
		System.out.println("==============");
		incrementNumsDiamondPattern(rows);
	}
}
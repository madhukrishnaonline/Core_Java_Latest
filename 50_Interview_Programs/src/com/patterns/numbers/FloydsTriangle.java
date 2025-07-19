package com.patterns.numbers;

public class FloydsTriangle {
	public static void floydsTriangle(int rows) {
		int number = 1;
		for (int row = 1; row <= rows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(number++ + " ");
			}
			System.out.println();
		}
	}

	public static void reverseFloydsTriangle(int rows) {
		int count = rows * (rows + 1) / 2; // Total numbers to print
		for (int row = 1; row <= rows; row++) {
			
			for (int col = row; col <= rows; col++) {
				System.out.print(count--+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int rows = 6;
		floydsTriangle(rows);
		System.out.println("============");
		reverseFloydsTriangle(rows);
	}
}
/*
int count = rows * (rows + 1) / 2; // Total numbers to print
Floyd's Triangle
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
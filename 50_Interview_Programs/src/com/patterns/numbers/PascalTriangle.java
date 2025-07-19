package com.patterns.numbers;

public class PascalTriangle {

	public static void printPascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int space = 0; space < rows - i; space++) {
				System.out.print(" ");
			}

			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	public static long findTheNumberFromPascalTriangle(int row, int col) {
		long result = 1;
		row = row - 1;
		col = col - 1;
		for (int i = 0; i < col; i++) {
			result = result * (row - i);
			result = result / (i + 1);
		}
		return result;
	}

	public static void printTheSpecificPascalRow(int row) {
		for (int i = 1; i <= row; i++) {
			System.out.print(findTheNumberFromPascalTriangle(row, i) + " ");
		}
	}
	
	/*public static void printPascalTriangle2(int rows) {
		for (int j = 1; j <= rows; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(findTheNumberFromPascalTriangle(j, i) + " ");
			}
			System.out.println();
		}
	}*/

	public static void printPascal(int rows) {
		for (int i = 1; i <= rows; i++) {
			int first = 1;
			System.out.print(first + " ");
			for (int j = 1; j < i; j++) {
				first = first * (i - j) / j;
				System.out.print(first + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		printPascalTriangle(5);
		System.out.println("====================");
		long result = findTheNumberFromPascalTriangle(3, 2);
		System.out.println(result);
		System.out.println("====================");
		printTheSpecificPascalRow(5);
		printPascal(5);
		System.out.println("====================");
		int rows = 5;
		for (int r = 1; r <= rows; r++) {
			long numb = 1;
			System.out.print(numb + " ");
			for (int i = 1; i < r; i++) {
				numb = numb * (r - i) / i;
				System.out.print(numb + " ");
			}
			System.out.println();
		}
	}
}
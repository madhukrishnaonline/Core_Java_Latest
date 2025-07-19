package com.patterns.numbers;

public class NRowsColumnsNumber {
	private static void sameNumbersSteps(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=i; j++) {
				 System.out.print(i);
			}//inner
			System.out.println();
		}//outer
	}
	
	private static void sameNumbersReverseSteps(int rows) {
		for (int i = rows; i>=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print(i);
			}//inner
			System.out.println();
		}//outer
	}

	private static void sameNumbersIncrementLeftSteps(int rows) {
		for (int i = 1; i<=rows; i++) {
			for (int j = i; j<rows; j++) {
				System.out.print(" ");
			}//inner
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}//for
			System.out.println();
		}//outer
	}
	
	public static void main(String[] args) {
		sameNumbersSteps(4);
		System.out.println("==================");
		sameNumbersReverseSteps(4);
		System.out.println("==================");
		sameNumbersIncrementLeftSteps(4);
		System.out.println("==================");
		int rows = 6;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print("4 ");
			} // inner
			System.out.println();
		} // for
	}

}

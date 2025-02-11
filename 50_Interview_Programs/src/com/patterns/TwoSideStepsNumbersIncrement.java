package com.patterns;

public class TwoSideStepsNumbersIncrement {
	/*
	 *                     1
	 *                   232
	 *                 34543
	 *               4567654
	 */
	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			// print spaces
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			} // inner
			int num = i;
				// print number
			for (int k = 1; k <= i; k++) {
				System.out.print(num);
				num++;
			} // inner for
			num-= 2;
			for(int k=1;k<i;k++) {
				System.out.print(num);
				num--;
			}//inner
				// again print spaces
			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			} // inner
			System.out.println();
		} // outer
	}

	public static void main(String[] args) {
		printPattern(4);
	}//main

}

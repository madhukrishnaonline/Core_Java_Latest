package com.patterns;

public class TrianglePatterns {
	private static void rightAngleTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			} // for
			System.out.println();
		} // outer
	}
	
	private static void leftAngleTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j<rows; j++) {
				System.out.print(" ");
			} // for
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}//for
			System.out.println();
		} // outer
	}

	public static void main(String[] args) {
		rightAngleTriangle(6);
		leftAngleTriangle(6);
	}

}

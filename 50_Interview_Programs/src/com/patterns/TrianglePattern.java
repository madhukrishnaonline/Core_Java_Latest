package com.patterns;

public class TrianglePattern {

	public static void main(String[] args) {
		int rows = 4;
		System.out.println("Right Angle Triangle");
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			} // for
			System.out.println();
		} // for

		System.out.println("Inverted Right Angle Triangle");
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			} // for
			System.out.println();
		} // for

		System.out.println("Equilateral Triangle");
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j > i; j--) {
				System.out.print("  "); // Print spaces
			} // innerFor1
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("* "); // Print stars
			} // innerFor2
			System.out.println();
		} // outerFor
		
		System.out.println("Diamond Pattern");
		 // Top half
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
        
        // Bottom half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* "); // Print stars
            }
            System.out.println();
        }
	}// main
}// class
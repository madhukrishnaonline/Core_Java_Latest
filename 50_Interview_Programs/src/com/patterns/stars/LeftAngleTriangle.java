package com.patterns.stars;

public class LeftAngleTriangle {
	public static void leftAngleTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void invertedLeftAngleTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= rows; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int rows = 5;
		leftAngleTriangle(rows);
		System.out.println("==================");
		invertedLeftAngleTriangle(rows);
	}

}
/*
============
Left Angle
        *
      * *
    * * *
  * * * *
* * * * *
============
Inverted
* * * * *
* * * *
* * *
* *
*
============
*/
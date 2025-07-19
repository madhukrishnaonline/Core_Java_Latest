package com.patterns.stars;

public class RightAngleTriangle {
	public static void rightAngleTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void invertedRightAngleTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int rows = 5;
		rightAngleTriangle(rows);
		System.out.println("===============");
		invertedRightAngleTriangle(rows);
	}
}
/*
===========
Right Angle
 *
 * *
 * * *
 * * * *
 * * * * *
===========
Inverted 
 * * * * *
 * * * *
 * * *
 * *
 *
============  
 */
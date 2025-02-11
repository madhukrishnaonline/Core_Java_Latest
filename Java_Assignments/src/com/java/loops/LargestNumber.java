package com.java.loops;

public class LargestNumber {
	public static int largestNumber(int x, int y, int z) {
		if (x > y && x > z) {
			return x;
		} // if
		else if (y > x && y > z) {
			return y;
		} // else if
		else {
			return z;
		} // else
	}

	public static void main(String[] args) {
		System.out.println(largestNumber(1, 2, 3));

		System.out.println("Largest Number in 10,20,30");
		int a = 10;
		int b = 20;
		int c = 30;
		if (a > b) {
			if (a > c) {
				System.out.println(a + " " + "is the largest number");
			} // if
			else {
				System.out.println(c + " " + "is the largest number");
			} // else
		} // if
		else if (b > a) {
			if (b > c) {
				System.out.println(b + " " + "is the largest number");
			} // if
			else {
				System.out.println(c + " " + "is the largest number");
			} // else
		} // else if
		else {
			System.out.println(c + " " + "is the largest number");
		} // else
	}// main
}// class
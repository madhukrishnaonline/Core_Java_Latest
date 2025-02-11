package com.java.operators;

public class SmallLargeNumber {
	public static int verifyNumber(int x, int y) {
		if (x > y) {
			return x;
		} // if
		else if (x == y) {
			return 0;
		} // else if
		else {
			return y;
		} // else
	}

	public static void main(String[] args) {
		System.out.println(verifyNumber(12, 13));
	}// main
}// class
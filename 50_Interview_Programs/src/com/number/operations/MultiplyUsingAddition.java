package com.number.operations;

public class MultiplyUsingAddition {

	private static int multiply(int a, int b) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += b;
		} // for
		return sum;
	}

	public static void main(String[] args) {
		int multiply = multiply(12, 12);
		System.out.println(multiply);
	}// main


}

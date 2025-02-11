package com.java.operators;

public class ArithmeticOperators {
	public int[] operations(int x, int y) {
		return new int[] { x + y, x * y, y - x, y / x };
	}

	public static void main(String[] args) {
		ArithmeticOperators operator = new ArithmeticOperators();
		int[] arr = operator.operations(12, 14);
		for (int i : arr) {
			System.out.println(i);
		} // for
	}// main
}// class
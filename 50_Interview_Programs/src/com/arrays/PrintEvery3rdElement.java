package com.arrays;

public class PrintEvery3rdElement {
	private static void print3rdElement(int[] arr) {
		for (int i = 2; i < arr.length; i+=3) {
			System.out.println(arr[i]);
		} // for
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 6, 7, 8, 9, 0 };
		print3rdElement(arr);

	}

}

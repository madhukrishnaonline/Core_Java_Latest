package com.arrays;

public class ArraysPrintNext {

	public static void printTheNextBigOrEqualVal(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			int x = arr[0];
			if (x <= arr[i]) {
				System.out.println(arr[i]);
				if (i < arr.length) {
					x = arr[i + 1];
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 0, 6, 9, 10 };
		printTheNextBigOrEqualVal(arr);
	}
}
package com.arrays;

public class FindTheIndicesOfTwoEleOfTarget {

	public static void main(String[] args) throws IllegalAccessException {
		int[] arr = { 2, 3, 4, 1, 8, 9, 7 };
		findTheIndicesOfTwoEleOfTarget(arr, 10);
	}

	public static void findTheIndicesOfTwoEleOfTarget(int[] arr, int target) throws IllegalAccessException {
		int len = arr.length;
		if (len <= 0) {
			throw new IllegalAccessException("array length must not be 0");
		}
		for (int i = 0; i < len; i++) {
			int temp = arr[i];
			for (int j = i + 1; j < len; j++) {
				if (arr[j] + temp == target) {
					System.out.println(i + " " + j);
					return;
				}
			}
		}
	}

}

package com.arrays;

public class FindDiffBwLargeSmallInArray {
	public static Integer findDiff(Integer[] arr) {
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} // if
			if (arr[i] > max) {
				max = arr[i];
			} // else
		} // outer
		return max - min;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 3, 2, 5, 7, 8, 9 ,10};
		System.out.println(findDiff(arr));
	}

}

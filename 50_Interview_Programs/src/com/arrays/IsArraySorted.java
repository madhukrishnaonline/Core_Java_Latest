package com.arrays;

import java.util.Arrays;

public class IsArraySorted {

	public static boolean isSorted(Integer[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int first = arr[i];
			int next = arr[i + 1];
			if (first > next) {
				return false;
			} // if
		} // for
		return true;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 2, 3, 1, 5, 4, 6 };
		Arrays.sort(arr);
		if (isSorted(arr)) {
			System.out.println("Sorted");
		} // if
		else {
			System.out.println("Not Sorted");
		} // else
	}// main
}

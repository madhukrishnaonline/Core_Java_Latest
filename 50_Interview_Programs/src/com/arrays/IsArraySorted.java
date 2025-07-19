package com.arrays;

import java.util.Arrays;

public class IsArraySorted {
	public static boolean isArraySorted(Integer[] arr) {
		Integer[] copyArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(copyArr);
		return Arrays.equals(arr, copyArr);
	}

	public static boolean isSorted(Integer[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int first = arr[i];
			for (int j = i + 1; j < len; j++) {
				int next = arr[j];
				if (first > next) {
					return false;
				} // if
			} // inner
		} // for
		return true;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 2, 3, 1, 5, 4, 6 };
//		Arrays.sort(arr);
		if (isSorted(arr)) {
			System.out.println("Sorted");
		} // if
		else {
			System.out.println("Not Sorted");
		} // else

		if (isArraySorted(arr)) {
			System.out.println("Array Is Sorted");
		} else {
			System.out.println("Array Is Not Sorted");
		}
	}// main
}

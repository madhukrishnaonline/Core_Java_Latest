package com.arrays;

public class RemoveZeroesInArray {
	private static Integer[] removeZeroes(Integer arr[]) {
		int len = 0;
		for (Integer a : arr) {
			if (a != 0) {
				len++;
			} // if
		} // for
		Integer[] arr1 = new Integer[len];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[index++] = arr[i];
			} // if
		} // for
		return arr1;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 2, 3, 4, 1, 0, 7, 0, 5, 0 };
		Integer[] arr1 = removeZeroes(arr);
		for (Integer a : arr1) {
			System.out.print(a + " ");
		} // for
	}

}

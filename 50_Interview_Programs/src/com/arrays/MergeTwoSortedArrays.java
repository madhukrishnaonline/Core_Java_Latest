package com.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	private static Integer[] merge(Integer[] arr1, Integer[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int index = 0;
		Integer[] arr = new Integer[arr1.length + arr2.length];
		for (Integer a : arr1) {
			arr[index++] = a;
		}
		for (Integer a : arr2) {
			arr[index++] = a;
		}
		Arrays.sort(arr);
		return arr;
	}

	private static Integer[] mergeArr(Integer[] arr1, Integer[] arr2) {
		Integer[] arr = new Integer[arr1.length + arr2.length];
		int i = 0, j = 0, index = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr[index++] = arr1[i++];
			} // if
			else {
				arr[index++] = arr2[j++];
			} // else
		} // while

		while (i < arr1.length) {
			arr[index++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr[index++] = arr2[j++];
		}

		return arr;
	}

	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] { 2, 3, 4, 1, 8 };
		Integer[] arr2 = new Integer[] { 7, 0, 5, 0 };
		Integer[] merge = merge(arr1, arr2);
		for (Integer a : merge) {
			System.out.print(a + " ");
		}
		System.out.println();
		Integer[] mergeArr = mergeArr(arr1, arr2);
		for (Integer a : mergeArr) {
			System.out.print(a + " ");
		}
	}// main
}
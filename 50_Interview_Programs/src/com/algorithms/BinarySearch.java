package com.algorithms;

public class BinarySearch {
	public static int binarySearch(int[] arr, int size, int target) {
		int left = 0, right = size - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = binarySearch(arr, arr.length, 3);
		System.out.println(index);
	}

}

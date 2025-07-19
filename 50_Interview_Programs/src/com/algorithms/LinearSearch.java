package com.algorithms;

public class LinearSearch {
	//best case O(1) in time complexity when target is at start
	//worst case O(n) in time complexity when target is at end or not found
	//space complexity O(1)
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 0, 5, 10, 12, 2, 7, 5 };
		int index = linearSearch(arr, 1);
		System.out.println("Index :: "+index);
	}
}
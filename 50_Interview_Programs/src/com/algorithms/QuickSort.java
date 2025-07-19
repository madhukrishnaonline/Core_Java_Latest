package com.algorithms;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] arr, int lowerBound, int upperBound) {
		if (lowerBound < upperBound) {
			int val = partition(arr, lowerBound, upperBound);
			sort(arr, lowerBound, val - 1);
			sort(arr, val + 1, upperBound);
		}
	}

	private static int partition(int[] arr, int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;
		while (start < end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				swap(arr, start, end);
			}
		}
		return end;
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 0, 5, 10, 12, 2, 7, 5 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}

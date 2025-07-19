package com.algorithms;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minElementIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minElementIndex] > arr[j]) {
					minElementIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minElementIndex];
			arr[minElementIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 0, 5, 10, 12, 2, 7, 5 };
		selectionSort(arr);
		for (int a : arr) {
			System.out.println(a);
		}
	}
}
package com.algorithms;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 1, 0, 5, 10, 12, 2, 7, 5 };
		insertionSort(arr);
		for (int a : arr) {
			System.out.print(a+" ");
		}
	}

}
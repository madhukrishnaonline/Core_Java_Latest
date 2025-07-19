package com.sortings;

public class QuickSorting implements Sortable {
	@Override
	public void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi);
			quickSort(arr, pi + 1, high);
		}
	}

	private int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int start = low - 1;
		int end = high + 1;

		while (true) {
			do {
				start++;
			} while (arr[start] < pivot);
			do {
				end--;
			} while (arr[end] > pivot);
			if (start >= end) {
				return end;
			}
			swap(arr, start, end);
		}
	}

	private void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
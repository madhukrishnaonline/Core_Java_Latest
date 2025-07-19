package com.algorithms;

public class MergeSort {
	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int left = mid - low + 1;
		int right = high - mid;

		int[] l1 = new int[left];
		int[] l2 = new int[right];

		for (int i = 0; i < left; i++) {
			l1[i] = arr[low + i];
		}
		for (int i = 0; i < right; i++) {
			l2[i] = arr[mid + 1 + i];
		}
		int i = 0, j = 0, k = low;
		while (i < left && j < right) {
			if (l1[i] <= l2[j]) {
				arr[k++] = l1[i++];
			} else {
				arr[k++] = l2[j++];
			}
		}
		while (i < left) {
			arr[k++] = l1[i++];
		}
		while (j < right) {
			arr[k++] = l2[j++];
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 0, 5, 10, 12, 2, 7, 5 };
		mergeSort(arr, 0, arr.length - 1);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}
}
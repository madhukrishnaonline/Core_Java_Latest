package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {// no.of passes
			boolean flag = false;
			for (int j = 0; j < arr.length - 1; j++) { // no.of Comparison/iteration
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 2, 5, 1, 2, 3, 6, 0, 9 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
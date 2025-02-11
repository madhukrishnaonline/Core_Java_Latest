package com.arrays;

import java.util.Arrays;

public class Temp {
	public static void moveAllZeroesToEnd(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void moveAllZeroesToFront(Integer[] arr) {
		int len = arr.length;

		for (int i = len - 1; i >= 0; i--) {
			for (int j = len - 2; j >= 0; j--) {
				if (arr[i] == 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 0, 3, 0, 1, 0, 2, 5, 6, 0 };
		moveAllZeroesToEnd(arr1);

		System.out.println(Arrays.toString(arr1));
		System.out.println("------------------");
		
		moveAllZeroesToFront(arr1);
		System.out.println(Arrays.toString(arr1));

	}
}

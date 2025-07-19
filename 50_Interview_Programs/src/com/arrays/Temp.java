package com.arrays;

import java.util.Arrays;

public class Temp {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 8, 4, 5, 7, 0, 99, 6, 35, 12, -1, -100 };
		// Integer[] arr2 = { 1, 2, 3, 4, 5, 7, 0 };
		Arrays.parallelSort(arr1);
		for(int a:arr1) {
			System.out.println(a);
		}
	}
}

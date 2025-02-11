package com.arrays;

import java.util.Arrays;

public class MoveAllZeroesToEndInArray {

	private static void moveAllZeroesToEnd(Integer[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			} // if
		} // for

		while (index < arr.length) {
			arr[index++] = 0;
		} // while
	}

	public static void moveAllZeroesToFront(Integer[] arr) {

		if (arr.length <= 2) {
			System.err.println("Length should be atleast 3");
		}
		int len = arr.length;
		int index = len - 1;

		for (int i = len-1; i >=0; i--) {
			if (arr[i] != 0) {
				arr[index--] = arr[i];
			}
		}
		int zeroLen=index;
		for(int i=0;i<=zeroLen;i++) {
			arr[index--]=0;
		}

	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 0, 1, 2, 0, 9, 0, 6, 0 };
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		
		moveAllZeroesToEnd(arr);
		System.out.println("Move All Zeroes to End");
		System.out.println(Arrays.toString(arr));
		
		moveAllZeroesToFront(arr);
		System.out.println("Move All Zeroes to Front");
		System.out.println(Arrays.toString(arr));
		
	}// main

}

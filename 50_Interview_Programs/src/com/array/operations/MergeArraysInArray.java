package com.array.operations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeArraysInArray {
	public static int[] mergeArray(int[] arrayA, int[] arrayB) {
		int[] mergedArray = new int[arrayA.length + arrayB.length];
		int i = 0, j = 0, k = 0;
		
		while (i < arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		} // if
		
		while (j < arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		} // if
		
		Arrays.sort(mergedArray);
		return mergedArray;
	}// method

	public static void main(String[] args) {
		int[] array1 = new int[] { 2, 3, 2, 1, 6, 5, 3 };
		int[] array2 = new int[] { -2, 3, -1, -2, -6, 5, 3 };

		int[] mergeArrays = mergeArray(array1, array2);
//         String string = Arrays.toString(mergeArrays);
		for(int arr:mergeArrays) {
			System.out.print(arr+" ");
		}
		Arrays.asList(mergeArrays).stream().collect(Collectors.toList()).stream().distinct().toString();
	}// main
}// class
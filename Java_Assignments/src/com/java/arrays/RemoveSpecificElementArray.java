package com.java.arrays;

public class RemoveSpecificElementArray {
	public static int[] removeTheElement(int[] arr, int index) {
		// If the array is empty
		// or the index is not in array range
		// return the original array
		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		} // if
		// Create another array of size one less
		int[] arr2 = new int[arr.length - 1];
		// Copy the elements except the index
		// from original array to the other array
		for (int i = 0, k = 0; i < arr.length; i++) {
			// if the index is
			// the removal element index
			if (i == index) {
				continue;
			}//if
			// if the index is not
			// the removal element index
			arr2[k++] = arr[i];
		}//for
		// return the resultant array
		return arr2;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {5,3,4,2,6,1,0};
		arr = removeTheElement(arr, 0);
		for(int k:arr) {
			System.out.print(k+" ");
		}//for
	}// main
}// class
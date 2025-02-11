package com.java.arrays;

public class IndexNumberOfArray {
	public static int findIndex(int arr[], int t) {
		// if array is Null
		if (arr == null) {
			return -1;
		} // if

		// find length of array
		int len = arr.length;
		int i = 0;
		// traverse in the array
		while (i < len) {
			if (arr[i] == t) {
				return i;
			} // if
			else {
				i = i + 1;
			} // else
		} // while
		return -1;
	}// findIndex

	public static void main(String[] args) {
		int arr[] = new int[] {5,3,4,2,6,1,0};
		System.out.println(findIndex(arr, 5));
	}//main
}//class
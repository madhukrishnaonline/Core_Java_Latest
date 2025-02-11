package com.java.arrays;

import java.util.Arrays;

public class InsertAtSpecificIndex {
	public static int[] insertX(int n, int arr[], int x, int position) {
		int i;
		// create a new array of size n+1
		int newarr[] = new int[n + 1];

		/* insert the elements from
		*the old array into the new array insert all elements till pos then insert x at pos
		 then insert rest of the elements*/
		for (i = 0; i < n + 1; i++) {
			if (i < position - 1)
				newarr[i] = arr[i];
			else if (i == position - 1)
				newarr[i] = x;
			else
				newarr[i] = arr[i - 1];
		}
		return newarr;
	}

// Driver code
	public static void main(String[] args) {
		int n = 10;
//		int i;
// initial array of size 10
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

// print the original array
		System.out.println("Initial Array:\n" + Arrays.toString(arr));

// element to be inserted
		int x = 50;

// position at which element
// is to be inserted
		int position = 5;

// call the method to insert x
// in arr at position pos
		arr = insertX(n, arr, x, position);

// print the updated array
		System.out.println("\nArray with " + x + " inserted at position " + position + ":\n" + Arrays.toString(arr));
	}// main
}// class
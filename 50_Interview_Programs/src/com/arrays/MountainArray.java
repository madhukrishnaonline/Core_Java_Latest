package com.arrays;

/*
 * int[] arr = {1, 3, 5, 7, 6, 4, 2};  // This is a mountain array
 * Increasing: 1 → 3 → 5 → 7
 *  Peak: 7
 * Decreasing: 7 → 6 → 4 → 2
 * 
 * int[] arr = {2, 2, 3, 4, 3, 2};  // Not strictly increasing at start (2,2)
   int[] arr = {1, 2, 3, 4, 5};     // No decreasing part
   int[] arr = {5, 4, 3, 2, 1};     // No increasing part
 * 
 */
public class MountainArray {
	public static boolean isMountainArray(int[] arr) {
		int n = arr.length;
		if (n < 3) {
			return false;
		}
		int i = 0;

		// Climb up
		while (i + 1 < n && arr[i] < arr[i + 1]) {
			i++;
		}

		// Peak can't be at start or end
		if (i == 0 || i == n - 1)
			return false;

		// Climb down
		while (i + 1 < n && arr[i] > arr[i + 1]) {
			i++;
		}

		return i == n - 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 9 };
		boolean mountainArray = isMountainArray(arr);
		System.out.println(mountainArray);
	}
}
package com.multi.arrays;

public class SearchElement {
	public static String searchElement(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (target == arr[i][j]) {
					return "Found at row=" + i + ", column=" + j;
				}
			}
		}
		return "Not found";
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 } };
		String response = searchElement(arr, 7);
		System.out.println(response);
	}

}

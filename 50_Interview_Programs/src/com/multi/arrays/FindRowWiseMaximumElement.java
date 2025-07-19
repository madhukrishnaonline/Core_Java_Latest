package com.multi.arrays;

public class FindRowWiseMaximumElement {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 1, 2, 3, 4 } };
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println("Max Element "+max+" from "+i+" row");
		}
	}
}
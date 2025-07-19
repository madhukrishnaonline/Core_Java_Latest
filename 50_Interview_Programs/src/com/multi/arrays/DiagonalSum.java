package com.multi.arrays;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 5, 6, 7 }, { 1, 2, 3 } };

		int primarySum = 0, secondarySum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					primarySum += arr[i][j];
				}
				if (i + j == arr[i].length - 1) {
					secondarySum += arr[i][j];
				}
			}
		}
		System.out.println("Primary Sum :: " + primarySum);
		System.out.println("Secondary Sum :: " + secondarySum);
	}
}
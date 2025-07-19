package com.multi.arrays;

public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 } };
		// rows*columns
		/*int maxCols = 0;
		        for(int i=0;i<arr.length;i++) {
					maxCols = Math.max(maxCols, arr[i].length);
				}
				int[][] transposeMatrix = new int[maxCols][arr.length];*/
		int[][] transposeMatrix = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				transposeMatrix[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < transposeMatrix.length; i++) {
			for (int a : transposeMatrix[i]) {
				System.out.println(a);
			}
		}
	}
}
package com.array.operations;

public class JaggedArray {

	public static void main(String[] args) {
		int arr1[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int len = arr1.length;
		System.out.println("Length :: "+len);
//		System.out.println(arr1[1][0]);
		for(int i=0;i<arr1.length;i++) {
			                   //arr1[0].length=3
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println(arr1[j][i]);
			}//for
		}//for

	}// main
}// class
package com.multi.arrays;

public class MatrixSum {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8,9},{1,2,3,4}};
		int sum=0;
		for(int[] ar:arr) {
			for(int a:ar) {
				sum+=a;
			}
		}
		System.out.println("Sum of Matrix :: "+sum);
	}
}
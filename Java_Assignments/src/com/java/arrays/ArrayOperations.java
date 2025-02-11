package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding an Integer values into Array");
		int arr[] = new int[] { 1, 3, 2, 4, 5, 0 };

		System.out.println("Printing Array Values");
		for (int j : arr) {
			System.out.print(j + " ");
		} // for

		System.out.println("\nAscending Order");
        Arrays.sort(arr);
		for(int s:arr) {
			System.out.print(s+" ");
		}//for
		System.out.println("\nDescending Order");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(i+" ");
		} // for

		System.out.println("\nAverage & Sum of an Integers");
		int sum = 0;
		for (int v : arr) {
			sum = sum + v;
		} // for
		System.out.println("Sum :: " + sum);
		float avg = (float)sum / 2;
		System.out.println("Average :: " + avg);

		System.out.println("Minimum Number");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i ; j <=i; j++) {
				if(arr[i]>arr[j]) {
					System.out.println(arr[i]);
				}//if
			} // for
		} // for
		sc.close();
	}// main
}// class
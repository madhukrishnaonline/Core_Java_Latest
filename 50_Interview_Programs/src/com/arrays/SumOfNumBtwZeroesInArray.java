package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumBtwZeroesInArray {
	private static Integer[] sumBtwZeroesInArray(Integer[] arr) {
		List<Integer> sums = new ArrayList<>();

		int sum = 0;
		boolean counting = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				if (counting) {
					sums.add(sum);
					sum = 0;
				}//if
				counting = true;
			}//if
			else if (counting) {
				sum += arr[i];
			}
		}
		return sums.toArray(new Integer[0]);
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 0, 1, 2, 0, 4, 5, 0 };
		Integer[] array = sumBtwZeroesInArray(arr);
		for(Integer a:array) {
			System.out.print(a+" ");
		}
	}// main

}

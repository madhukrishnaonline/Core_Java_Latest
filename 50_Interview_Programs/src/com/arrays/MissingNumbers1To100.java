package com.arrays;

import java.util.Arrays;
import java.util.TreeSet;

public class MissingNumbers1To100 {
	public static int missingNumber(Integer[] arr) {
		int len = arr.length + 1;
		int sum = 0;
		int totalSum = len * (len + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // for
		return totalSum - sum;
	}
	
	public static void missingNumbers(Integer[] arr) {
		TreeSet<Integer> set = new TreeSet<>();
		set.addAll(Arrays.asList(arr));
		for(int i=1;i<=set.last();i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}//if
		}//for
	}

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 1,5,15,10,9,11 };
//		System.out.println(missingNumber(arr));
		missingNumbers(arr);
	}

}

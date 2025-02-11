package com.array.operations;

import java.util.TreeSet;

public class MissingNumbers {
	public static void main(String[] args) {
		/*	int arr[] = new int[] { 2, 7, 9, 7,6 };
			
			int n = arr.length;
			int[] arr2 = new int[n];
			
			Arrays.sort(arr);
			for (int i : arr) {
				arr2[i] = 1;
			//			System.out.println(arr2[i]);
				System.out.println(i);
			} // for
			System.out.println("Length:: "+arr2.length);
			System.out.println("=====Missing Numbers======");
			for (int i = 0; i <=arr2.length; i++) {
				if (arr2[i] == 0) {
					System.out.println(i);
				} // if
			} // for
		*/		
		Integer[] arr = { 2, 3, 5, 1, 6, 10, 0 };
		missingNumbers(arr);
	}// main

	private static void missingNumbers(Integer[] arr) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (Integer num : arr) {
			set.add(num);
		} // for
		for (int i = 0; i <= set.last(); i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			} // if
		} // for

	}// main
}// class
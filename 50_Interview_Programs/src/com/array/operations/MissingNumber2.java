package com.array.operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber2 {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 1, 3, 4, 5, 6, 10,50,0 };
		
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : arr) {
			set.add(i);
		} // for

		Arrays.sort(arr);
		for (int i = 0; i <= arr[arr.length-1]; i++) {
			if (!set.contains(i)) {
				System.out.println(i);
			} // if
		} // for

	}// main
}

package com.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesInArray {
	public static Set<Integer> findDuplicates(Integer arr[]) {
		Set<Integer> distinct = new LinkedHashSet<Integer>();
		Set<Integer> duplicates = new LinkedHashSet<Integer>();

		/*for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] ==arr[j]) {
					set.add(arr[i]);
					break;
				} // if
			} // inner
		} // for
		*/

		for (Integer value : arr) {
			if (!distinct.add(value)) {
				duplicates.add(value);
			} // if
		}
		return duplicates;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 3, 2, 3,3, 4, 4, 5, 6, 7 };
		findDuplicates(arr).forEach(System.out::println);
	}

}

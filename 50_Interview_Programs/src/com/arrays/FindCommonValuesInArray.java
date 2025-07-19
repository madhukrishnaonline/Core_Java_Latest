package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonValuesInArray {
	public static Set<Integer> commonValues(Integer[] arr1, Integer[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.addAll(Arrays.asList(arr1));
		for (int i = 0; i < arr2.length; i++) {
			if (set1.contains(arr2[i])) {
				set2.add(arr2[i]);
			} // if
		} // for
		
		return set2;
	}

	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {1,2,3,4,6,5,8};
		Integer[] arr2 = new Integer[] {1,2,3,5,6,2};
		commonValues(arr1, arr2).forEach(System.out::println);
	}
}
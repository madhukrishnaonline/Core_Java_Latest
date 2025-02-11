package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestContinuousIncreasingSubSequence {
	private static Integer[] findContinuousSubSequence(Integer[] arr) {
		int current = 1;
		int max = 0;

		if(arr.length==0) {
			return arr;
		}//if
		
		Set<Integer> currentSubSequence = new HashSet<>();
		Set<Integer> longestSubSequence = new HashSet<>();

		currentSubSequence.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				current++;
				currentSubSequence.add(arr[i]);
			} // if
			else {
				max = Math.max(max, current);
				current = 1;
				if (max > current) {
					longestSubSequence = new HashSet<>(currentSubSequence);
					currentSubSequence.clear();
				} // if
				currentSubSequence.add(arr[i]);
			} // else
		} // for
		return longestSubSequence.toArray(new Integer[0]);
	}

	private static int findLengthContinuousSubSequence(Integer[] arr) {
		int current = 1;
		int max = 1;
		if(arr.length==0) {
			return 0;
		}//if

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				current++;
				max = Math.max(max, current);
			} // if
			else {
				current = 1;
			} // else
		} // for
		return max;
	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 5, 4, 7, 8, 9, 10, 0 };
		System.out.println(findLengthContinuousSubSequence(arr));
		Integer[] sequence = findContinuousSubSequence(arr);
		for (Integer a : sequence) {
			System.out.print(a + " ");
		} // for
	}//main

}

package com.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Write a method to remove duplicate elements from an array
public class RemoveDuplicatesInArray {
	public static Integer[] removeDuplicates(Integer arr[]) {
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
	
		Integer arr1[] = set.toArray(new Integer[0]);
		return arr1;
	}
	
	public static int removeDupe(Integer[] arr) {
		Set<Integer> set = new TreeSet<>();
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(set.add(arr[i])) {
				arr[index++] = arr[i];
			}//if
		}//for
		return index;
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 1, 3, 5, 4, 7 };
		/*	Integer arr1[] = removeDuplicates(arr);
			for (Integer a : arr1) {
				System.out.println(a);
			} // for
		*/		

		for(int i=0;i<removeDupe(arr);i++) {
			System.out.println(arr[i]);
		}//for
	}// main

}

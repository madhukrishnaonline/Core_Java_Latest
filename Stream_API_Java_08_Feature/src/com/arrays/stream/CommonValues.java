package com.arrays.stream;

import java.util.HashSet;
import java.util.Set;

public class CommonValues {
	public static Set<Integer> commonValues(Integer[] arr1,Integer[] arr2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(Integer arr:arr1) {
			set1.add(arr);
		}//for
		
		for(Integer arr:arr2) {
			if(set1.contains(arr)) {
				set2.add(arr);
			}//if
		}///for
		return set2;
	}
	public static void main(String[] args) {
       Integer[] arr1 = new Integer[] {1,2,3,4,5};
       Integer[] arr2 = new Integer[] {3,4,5,6,7};
       Set<Integer> commonValues = commonValues(arr1, arr2);
       System.out.println(commonValues);
       
	}//main
}//class
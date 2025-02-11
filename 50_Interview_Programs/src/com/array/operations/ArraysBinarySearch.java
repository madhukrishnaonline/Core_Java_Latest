package com.array.operations;

import java.util.Arrays;

public class ArraysBinarySearch {
	public static void main(String[] args) {
		// How do you search an array for a specific element?
		// You can search an array to check whether it contains the given element -
		// or not using Arrays.binarySearch() method.
		// This method internally uses binary search algorithm to search for an element
		// in an array.
		
		 String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		 Arrays.sort(s1);
		 Arrays.spliterator(s1).forEachRemaining(num->{
			 System.out.println(num+"-"+num.indexOf(num.intern()));
		 });
		 int binarySearch = Arrays.binarySearch(s1, "TWO");
		 System.out.println(binarySearch);
		 
		 Integer[] i = {2,3,6,4,5,1,6};
		 int binarySearch2 = Arrays.binarySearch(i, 4);
		 System.out.println(binarySearch2);
	}//main
}//class
package com.mk.interview;

import java.util.Arrays;

public class ArrayCopyToAnotherArray {

	public static void main(String[] args) {
		Integer arr1[] = new Integer[] {1,2,3,4,5};
		
		Integer[] copyOf = Arrays.copyOf(arr1,arr1.length);
		for(Integer n:copyOf)
		{
			System.out.print(n+" ");
		}//for
	}//main

}//class

package com.arrays;

public class CheckArrayContainsSpecificValues {
	public static Boolean contains(Integer arr[], int value) {
		boolean isContain = false;
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				isContain = true;
			} // if
		} // for
		return isContain;
	}
	
	public static Boolean contains(Integer arr[], int value1,int value2) {
		boolean isContain = false;
		for (int i = 0; i < arr.length; i++) {
			if (value1 == arr[i]) {
				isContain = true;
			} // if
			else if(value2==arr[i]) {
			   isContain = true;	
			}//if
			else {
				isContain = false;
			}//else
		} // for
		return isContain;
	}

	public static void main(String[] args) {
		System.out.println(contains(new Integer[] { 1, 3, 4, 6, 8, 9 }, 3));
		System.out.println("=======");
		System.out.println(contains(new Integer[] { 1, 3, 4, 6, 8, 9 }, 3,0));
	}
}
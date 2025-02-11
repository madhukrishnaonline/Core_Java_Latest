package com.arrays;

//Write a function to remove a specific element from an array
public class RemoveSpecificElementInArray {
	public static Integer[] remove(Integer arr[], int element) {
       if(arr.length==0) {
    	   throw new IllegalArgumentException("No elements found in array");
       }//if
		Integer[] arr1 = new Integer[arr.length - 1];
		for (int i = 0, j=0; i < arr.length; i++) {
			if (element != arr[i]) {
				arr1[j++] = arr[i];
			} // if
		} // for
		return arr1;
	}

	public static void main(String[] args) {
		Integer[] arr = remove(new Integer[] { 2, 3, 4, 56, 7, 1 }, 0);
		for (Integer val : arr) {
			System.out.print(val + " ");
		}
	}

}

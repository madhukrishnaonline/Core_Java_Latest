package com.arrays;

public class InsertSpecificElementInArray {

	public static Integer[] insertAt(Integer[] arr, int index, int element) {
		if (index < 0 || index > arr.length - 1) {
			throw new ArrayIndexOutOfBoundsException("Enter a valid index");
		} // if
		Integer[] arr1 = new Integer[arr.length + 1];

		for (int i = 0, j = 0; i < arr1.length; i++) {
			if (index == i) {
				arr1[i] = element;
			} // if
			else {
				arr1[i] = arr[j];
				j++;
			} // else
		} // for
		return arr1;
	}

	public static void main(String[] args) {
		Integer[] arr = insertAt(new Integer[] { 1, 2, 3, 5, 6, 7 }, 3, 4);
		for (Integer a : arr) {
			System.out.print(a+" ");
		}//for
		System.out.println("\n============");
		Integer[] arr1 = insertAt(arr, 0, 0);
		for (Integer a : arr1) {
			System.out.print(a+" ");
		}//for
		
	}

}

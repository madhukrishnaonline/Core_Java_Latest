package com.arrays;

public class LargeSmallInArrays {
	public static Integer minValue(Integer[] arr) {
		Integer min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} // if
		} // for
		return min;
	}

	public static Integer maxValue(Integer[] arr) {
		Integer max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} // if
		} // for
		return max;
	}

	public static void main(String[] args) {

		Integer arr1[] = new Integer[] { 2, 1, 3, 5, 9, 8 };
		System.out.println("Min Value :: " + minValue(arr1));
		System.out.println("Max Value :: " + maxValue(arr1));

		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]<min) {
				min = arr1[i];
			}//if
		}//for
		System.out.println(min);
		
//		int arr[] = new int[] { 2, 4, 3, 1, 5, 9, 8 };

		/*int largest = IntStream.of(arr).max().getAsInt();
		int secondLargest = IntStream.of(arr).filter(num->num!=largest).max().getAsInt();
		System.out.println(secondLargest);*/
	}// main
}// class
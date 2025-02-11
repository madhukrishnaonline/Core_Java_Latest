package com.arrays;

public class AverageOfArrayIntegers {
	public static Float calculateAvg(Integer[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} // for
		return (float) sum / arr.length;
	}

	public static void main(String[] args) {
		System.out.println(calculateAvg(new Integer[] {1,2,4,3,5}));
	}// main
}//class
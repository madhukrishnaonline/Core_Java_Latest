package com.arrays;

public class CountOfEvenOddInArray {
	public static void evenOddCount(Integer[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} // if
			else {
				oddCount++;
			} // else
		} // for
		System.out.println("Even Count :: " + evenCount);
		System.out.println("Odd Count :: " + oddCount);
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 4, 3, 5, 6, 8, 0, 9 };
		evenOddCount(arr);
	}

}

package com.arrays;

public class CheckConsecutiveOddNumbers {
	private static boolean haveConsecutiveOdds(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				count++;
				if (count == 3) {
					return true;
				} // if
			} // if
			else {
				count = 0;
			} // else
		} // for
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5, 7, 8, 9 };
		System.out.println(haveConsecutiveOdds(arr));
	}

}

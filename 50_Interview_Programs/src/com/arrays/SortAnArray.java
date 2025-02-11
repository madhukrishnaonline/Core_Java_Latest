package com.arrays;

public class SortAnArray {

	public static void sortArray(Integer arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} // if
			} // inner
		} // for
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 2, 1, 3, 0, 5, 4, 3 };
		sortArray(arr);
		for (Integer a : arr) {
			System.out.println(a);
		} // for
	}// main
}

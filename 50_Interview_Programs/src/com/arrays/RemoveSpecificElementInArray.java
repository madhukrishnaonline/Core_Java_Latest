package com.arrays;

//Write a function to remove a specific element from an array
public class RemoveSpecificElementInArray {

	public static int[] removeByElement(int arr[], int element) {
		if (arr.length == 0) {
			throw new IllegalArgumentException("No elements found in array");
		} // if
		int[] arr1 = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (element != arr[i]) {
				arr1[j++] = arr[i];
			} // if
		} // for
		return arr1;
	}

	public static void removeByIndex(int arr[], int index) {
		if (index < 0) {
			throw new RuntimeException("Index must be positive");
		} // if

		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = -1;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 56, 7, 1 };
		System.out.println("Removing Elements by Element");
		int[] newArr = removeByElement(arr, 4);
		for (int val : newArr) {
			System.out.print(val + " ");
		}

		System.out.println("\nRemoving Elements by Index");
		removeByIndex(arr, 2);
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}
}
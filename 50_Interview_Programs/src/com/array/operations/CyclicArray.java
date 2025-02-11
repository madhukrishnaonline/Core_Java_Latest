package com.array.operations;

public class CyclicArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6};
		int len = arr1.length;
		int size = 0;
		for (int i = 0; i < 12; i++) {
			int index = i % len;
			System.out.println(arr1[index]);
            size++;
		} // for
		int[] arr2 = new int[size];
		System.out.println("length :: "+arr2.length);

	}// main
}// class
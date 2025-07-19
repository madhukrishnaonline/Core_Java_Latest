package com.sortings;

import java.util.Arrays;

public class MainSort {
	public static void main(String[] args) {
		int[] arr = { 2, 0, 9, 1, 3, 10, 7,1 };
		Sortable sortable1 = new Sortable() {};
		sortable1.sort(arr);
		System.out.println("Sortable Sort :: "+Arrays.toString(arr));
		
		Sortable sortable = new QuickSorting();
		sortable.sort(arr);
		System.out.println("Quick Sort :: "+Arrays.toString(arr));
		
	}
}
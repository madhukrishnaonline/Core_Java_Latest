package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindTheMiddleElements {

	public static <T> List<T> findMiddleElements(T[] arr) {
		int len = arr.length;
		List<T> list = new ArrayList<T>();
		if (len % 2 == 1) {
			list.add(arr[len / 2]);
		} else {
			list.add(arr[len / 2 - 1]);
			list.add(arr[len / 2]);
		}
		return list;
	}

	public static <T> void printMiddleElements(T[] arr) {
		int len = arr.length;
		if (len % 2 == 1) {
			System.out.println(arr[len / 2]);
		} else {
			System.out.println(arr[len / 2 - 1] + " " + arr[len / 2]);
		}
	}

	public static void main(String[] args) {
		String[] str = { "madhu", "krishna", "raju" };
		Integer[] arr = { 2, 1, 3, 54, 6 ,0};

//		findMiddleElements(str).forEach(System.out::println);
//		findMiddleElements(arr).forEach(System.out::println);

		printMiddleElements(str);
		printMiddleElements(arr);
	}
}
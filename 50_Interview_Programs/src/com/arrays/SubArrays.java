package com.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubArrays {
	private static List<List<Integer>> returnPossibleSubArrays(Integer[] arr) {
		List<List<Integer>> subArrays = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				List<Integer> subArray = new ArrayList<>();
				for (int k = i; k <= j; k++) {
					subArray.add(arr[k]);
				} // for
				subArrays.add(subArray);
			} // inner
		} // outer for
		return subArrays;
	}

	private static void sumOfSubArrays(Integer[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int subArray = 0;
			for (int j = i; j < arr.length; j++) {
				int temp = arr[j];
				subArray += temp;
				sum += subArray;
			} // for
		} // outer
		System.out.println(sum);
	}

	private static double findMaxAvgOfKLengthSubArray(Integer[] arr, int size) {
		List<List<Integer>> subArrays = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				List<Integer> subArray = new ArrayList<>();
				for (int k = i; k <= j; k++) {
					subArray.add(arr[k]);
				} // inner
				subArrays.add(subArray);
			} // inner
		} // outer

		List<Integer> list2 = subArrays.stream().filter(list -> list.size() == 4)
				.map(list -> list.stream().reduce(0, (a, b) -> a + b)).collect(Collectors.toList());
		list2.stream().mapToDouble(total -> total / size).forEach(System.out::println);
		double max = list2.stream().mapToDouble(total -> (double)total/size).max().getAsDouble();
		return max;
	}

	public static void main(String[] args) {
		Integer arr[] = { 1, 12, -5, -6, 50, 3 };
		double max = findMaxAvgOfKLengthSubArray(arr, 4);
		System.out.println("Max Avg ::" + max);
		
		/*sumOfSubArrays(arr);
		List<List<Integer>> subArrays = returnPossibleSubArrays(arr);
		subArrays.stream().forEach(System.out::println);
		
		List<Integer> sum = subArrays.stream().map(list -> list.stream().reduce(0, (a, b) -> a + b)).collect(Collectors.toList());
		System.out.println("Total Sum of SubArrays :: "+sum);
		
		List<Integer> evenSum = subArrays.stream().map(list -> list.stream().reduce(0, (a, b) -> a + b))
				.filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Sum :: " + evenSum);
		
		List<Integer> oddSum = subArrays.stream().map(list -> list.stream().reduce(0, (a, b) -> a + b))
				.filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd Sum:: " + oddSum);
		*/
	}

}

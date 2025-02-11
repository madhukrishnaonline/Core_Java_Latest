package com.array.operations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LonelyInteger {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 3, 2, 1,5 };

		Arrays.asList(arr).stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream()
				.filter(v -> v.getValue() == 1).map(k -> k.getKey()).forEach(System.out::println);
	}// main
}
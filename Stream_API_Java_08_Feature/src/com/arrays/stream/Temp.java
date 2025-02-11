package com.arrays.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Temp {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 5, 4, 3, 7, 7, 7, 3);
		Entry<Integer, Integer> max = list.stream().collect(
				Collectors.toMap(num -> num, num -> Collections.frequency(list, num), (oldValue, newValue) -> newValue))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(max);

	}// main
}// class
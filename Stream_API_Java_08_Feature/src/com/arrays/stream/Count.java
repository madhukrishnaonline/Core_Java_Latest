package com.arrays.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count {
	public static void main(String[] args) {
		String str = "Subbu";

		Entry<String, Long> entry = Arrays.asList(str.split("")).stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}// main
}// class
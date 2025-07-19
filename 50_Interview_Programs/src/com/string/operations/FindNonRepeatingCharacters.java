package com.string.operations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatingCharacters {

	public static void main(String[] args) {
		String str = "BigBoss";

		System.out.println("With HashMap");
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
//		map.entrySet().stream().filter(set -> set.getValue() == 1).map(m -> m.getKey()).forEach(System.out::println);

		System.out.println("With Streams");
		Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey())
				.forEach(System.out::println);
	}
}
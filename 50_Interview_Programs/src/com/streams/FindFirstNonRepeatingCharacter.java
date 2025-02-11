package com.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String[] arr = { "apple", "papad", "Pineapple", "muskmelon" };// find first non-repeating Character

		List<Character> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i].toLowerCase();
			str.chars().mapToObj(c->(char)c)
					.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
					.entrySet().stream().filter(str1 -> str1.getValue() == 1).limit(1).forEach(map->list.add(map.getKey()));
		}
		System.out.println(list);
		
		String str="banana";
		str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(str1 -> str1.getValue() > 2).limit(1).forEach(map->System.out.println(map.getKey()));
		
	}
}

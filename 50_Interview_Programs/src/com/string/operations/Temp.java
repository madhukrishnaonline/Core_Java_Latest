package com.string.operations;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {

	public static void main(String[] args) {
		String str = "johnny johnny yes papa eating sugar no papa telling lies no papa open your mouth hahahahah";
		String[] strArr = str.split(" ");
		int k = strArr.length - 1;
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					set.add(strArr[j]);
				}
			} // inner
		} // outer
//		set.forEach(System.out::println);

		Stream.of(strArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(map -> map.getValue() > 1).map(map -> map.getKey()).collect(Collectors.toList())
				.forEach(System.out::println);
	}// main
}

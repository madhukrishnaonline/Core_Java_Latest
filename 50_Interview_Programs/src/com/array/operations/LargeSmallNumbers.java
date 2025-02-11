package com.array.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargeSmallNumbers {
	public static void main(String[] args) {
		Integer[] i = new Integer[] { 2, 1, 3, 4, 2, 5, 3 };
		
		System.out.println("=====Large Number======");
		Optional<Integer> collect = Arrays.asList(i).stream().collect(Collectors.maxBy(Comparator.comparing(Integer::intValue)));
		System.out.println(collect.get());

		System.out.println("Second Largest Number Without Sorting");
		Map<Integer,Optional<Integer>> map = Arrays.asList(i).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.maxBy(Comparator.comparing(Integer::intValue))));
		map.entrySet().stream().skip(map.size()-2).limit(1).map(val->val.getValue().get()).forEach(System.out::println);

		System.out.println("=====Second Large Number======");
		Optional<Integer> findFirst = Arrays.asList(i).stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findFirst.get());

		System.out.println("=====Small Number======");
		Optional<Integer> min = Arrays.asList(i).stream().min(Comparator.comparing(Integer::intValue));
		System.out.println(min.get());

		System.out.println("=====Second Small Number======");
		Optional<Integer> findFirst2 = Arrays.asList(i).stream().sorted().skip(1).findFirst();
		System.out.println(findFirst2.get());

		System.out.println("=========int[]=================");
		int[] n = new int[] { 2, 1, 3, 4, 2, 3, 5, 3 };
		int len = n.length;
		System.out.println("=====Large Number======");
		int orElseThrow2 = Arrays.stream(n).max().orElseThrow();
		System.out.println(orElseThrow2);

		System.out.println("=====Second Largest======");
		Arrays.stream(n).sorted().skip(len - 2).limit(1).forEach(System.out::println);

		System.out.println("=====Smallest Number========");
		int orElseThrow = Arrays.stream(n).min().orElseThrow();
		System.out.println(orElseThrow);

	}// main
}// class
package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CollectionsMethods {
	public static void main(String[] args) {
		System.out.println("No of Immutable Object Copies");
		Collections.nCopies(5, "Krishna").forEach(System.out::println);
		
		System.out.println("No. of occurance");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 1, 2, 3, 1, 6);
		int frequency = Collections.frequency(list, 1);
		System.out.println(frequency);
		
		System.out.println("No. of occurances");
		Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(number -> number,
				number -> Collections.frequency(list, number), (oldValue, newValue) -> oldValue));
		System.out.println(collect);
		
		System.out.println("Most No. of Occurance");
		Entry<Integer, Integer> max = Collections.max(collect.entrySet(), Map.Entry.comparingByValue());
		System.out.println(max.getKey() + "-" + max.getValue());

		System.out.println("Common Elements");
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1,1,2,3,4,5);
		
		List<Integer> list2 = new ArrayList<Integer>();
		Collections.addAll(list2,3,4,5,6,7);
		
		boolean disjoint = Collections.disjoint(list1, list2);
		System.out.println(disjoint);
		
	}// main
}// class
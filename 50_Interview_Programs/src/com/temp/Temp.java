package com.temp;

import java.util.List;
import java.util.stream.Collectors;

public class Temp {
	public static void main(String[] args) {
//      1,3,6,10,15,21,......... find the Nth term of the series
		/*int size = 7;
		for (int i = 1; i <= size; i++) {
			int next = i;
			System.out.println(next);
			int increment = 2;
		    
		}*/
		List<Integer> list = List.of(2,1,5,4,6,8,4,5,15,4);
		list.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting())).entrySet().stream()
				.max((v1, v2) -> v1.getValue().compareTo(v2.getValue())).map(entry -> entry.getKey()).ifPresent(System.out::println);;
		
	}
}
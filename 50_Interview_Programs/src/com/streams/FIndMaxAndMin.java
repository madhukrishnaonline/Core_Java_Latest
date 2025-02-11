package com.streams;

import java.util.List;

public class FIndMaxAndMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 2, 3, 6, 77);
		
		Integer max = list.stream().max(Integer::compareTo).get();
		System.out.println(max);
		
		Integer secondMax = list.stream().filter(num->num!=max).max(Integer::compareTo).get();
		System.out.println(secondMax);
		
		Integer thirdMax = list.stream().filter(num->num!=max && num!=secondMax).max(Integer::compareTo).get();
		System.out.println(thirdMax);
	}
}

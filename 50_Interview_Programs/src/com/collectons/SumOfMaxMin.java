package com.collectons;

import java.util.Comparator;
import java.util.List;

public class SumOfMaxMin {
	private static int sumOfMaxAndMin(List<Integer> list) {
		Integer max1 = list.stream().max(Comparator.comparing(Integer::intValue)).get();
		Integer min = list.stream().min(Comparator.comparing(Integer::intValue)).get();
		return max1 + min;
	}
	private static int sumOfSecondMaxAndMin(List<Integer> list) {
		Integer max1 = list.stream().max(Comparator.comparing(Integer::intValue)).get();
		Integer max2 = list.stream().filter(num->num!=max1).max(Comparator.comparing(Integer::intValue)).get();
		
		Integer min1 = list.stream().min(Comparator.comparing(Integer::intValue)).get();
		Integer min2 = list.stream().filter(num->num!=min1).min(Comparator.comparing(Integer::intValue)).get();
		
		return max2 + min2;
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(2,1,3,5,0,9,8,7);
		int sumOfMaxAndMin = sumOfMaxAndMin(list);
		System.out.println(sumOfMaxAndMin);
		System.out.println(sumOfSecondMaxAndMin(list));
	}

}

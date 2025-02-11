package com.collectons;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
	private static Set<Integer> findDuplicates(List<Integer> list) {
		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> seen = new HashSet<>();
		
		for(Integer i:list) {
			if(!seen.add(i)) {
				duplicates.add(i);
			}//if
		}//for
		
		/*for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					set.add(list.get(j));
					break;
				} // if
			} // inner
		} // outer
		*/
		return duplicates;
	}

	public static void main(String[] args) {
		findDuplicates(List.of(2, 1, 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 1, 2)).forEach(System.out::println);
	}// main

}

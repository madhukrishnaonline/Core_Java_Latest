package com.list;

import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,1,23,4,5,6,1,1,2,2,3,8);
		
		Duplicates duplicates = new Duplicates();
		
		duplicates.setList(list);
		List<Integer> duplicatesList = duplicates.getDuplicatesList();
		System.out.println("Duplicates List :: " + duplicatesList);
	}// main
}// class
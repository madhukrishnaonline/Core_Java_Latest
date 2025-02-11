package com.collectons;

import java.util.List;

public class FindSpecifiedElement {
	public static int findIndexOfElement(List<Integer> list, Integer ele) {
		return list.indexOf(ele);
	}

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 3, 2, 4, 7, 65, 8, 9);
		System.out.println(findIndexOfElement(list, 9));
	}

}

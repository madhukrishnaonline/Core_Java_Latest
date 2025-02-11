package com.naresh.list.mcqs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");
	}
}
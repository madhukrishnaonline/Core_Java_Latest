package com.nareshit.convert_collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static <T> List<T> convertToList(T[] t) {
		return Arrays.asList(t);
	}
	
	public static void main(String[] args) {
		String[] str = {"madhu","krishna","arjun"};
		Integer[] arr = {2,3,1,4,65,7};
		
		List<String> stringArray = convertToList(str);
		System.out.println(stringArray);
	
		List<Integer> integerArray = convertToList(arr);
		System.out.println(integerArray);

	}
}

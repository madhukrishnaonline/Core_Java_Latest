package com.map;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperations {
	public static void main(String[] args) {

		HashMap<String,Long> map = new HashMap<>();
		map.put("krishna",9121493579l);
		map.put("krishna",9121493578l);
		map.put("krishna",9121493577l);
		map.put("Madhu",9121493579l);
		
		int size = map.size();
		System.out.println(size);
		
		List<String> list = map.keySet().stream().collect(Collectors.toList());
		System.out.println(list);
	}//main
}//class
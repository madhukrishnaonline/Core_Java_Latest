package com.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Temp {

	public static void main(String[] args) {
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		linkedMap.put("A", 2);
		linkedMap.put("b", 5);
		linkedMap.put("c", 1);
		linkedMap.put("d", 4);
		linkedMap.put("e", 3);
		
		Map<String, Integer> treeMap = new TreeMap<>(Comparator.comparingInt(linkedMap::get).reversed());
		treeMap.putAll(linkedMap);
		
		System.out.println(linkedMap);
		System.out.println(treeMap);
	}

}

package com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOperations {
	public static void main(String[] args) {

		Map<String, List<Integer>> map = new HashMap<>();
		map.put("Apple", new ArrayList<>(Arrays.asList(3)));
		map.put("Banana", new ArrayList<>(Arrays.asList(7)));

		map.compute("Apple", (k, v) -> null);
		map.compute("Pineapple", (k, v) -> new ArrayList<>(Arrays.asList(10)));

		List<Integer> list = map.computeIfPresent("Banana", (k, v) -> {
			v.add(6);
			return v;
		});
		if (list != null) {
			list.add(8);
		}

		map.computeIfAbsent("Dragon Fruit", k -> {
			List<Integer> dragonList = new ArrayList<>();
			dragonList.add(15);
			return dragonList;
		}).add(9);
		map.computeIfAbsent("Banana", k -> Arrays.asList(8));

		System.out.println("Size of Map :: " + map.size());
		map.forEach((k, v) -> {
			System.out.println(k + "=" + v);
		});
	}// main
}// class
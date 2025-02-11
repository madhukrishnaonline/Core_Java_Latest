package com.map.nareshit;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
		map.firstKey();
		System.out.println(map.size());
	}

}

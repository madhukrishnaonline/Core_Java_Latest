package com.map;

public class TestKrishnaMap {

	public static void main(String[] args) {
		KrishnaMap<Object, String> map = new KrishnaMap<>();
		map.put("A", "Krishna");
		map.put(65, "Madhu");
		map.put("Z", "Bunny");
		map.put(null, "Krishna");
		map.put(null, "Priyanka");
		
		System.out.println(map.get("A"));
		
		System.out.println(map);
		System.out.println("Size :: "+map.size());
	}
}
package com.hashmap;

public class Mian {
	public static void main(String[] args) {
		MyHashMap<Object, String> hashMap = new MyHashMap<>();
		hashMap.put("Z", "krishna");
		hashMap.put(65, "Bunny");
		hashMap.put("A", "Mahendar");
		hashMap.put(null, "Nullable");

		String string = hashMap.toString();
		System.out.println(string);
		System.out.println("Size of Map :: " + hashMap.size());
	}
}

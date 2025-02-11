package main;

import java.util.Hashtable;

public class Immutable {
	public static void main(String[] args) {
		String s1 = "MK";
		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		s1 = "mk";
		hash.put(s1, 23);
		hash.put("RK", 19);
		hash.put("madhavi", 23);
//		s1.toLowerCase();
		System.out.println(hash.get("MK"));
		
		

	}// main
}// class
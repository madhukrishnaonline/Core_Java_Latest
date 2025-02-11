package main;

import java.util.TreeMap;

public class TreeMap_Collection
{
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "Madhu");
		tm.put(2,"Krishna");
		tm.put(3,"Kummari");
		System.out.println(tm.get(3)+" "+tm.get(1)+" "+tm.get(2));
	}
   
}

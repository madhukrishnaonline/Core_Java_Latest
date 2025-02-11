package com.map.nareshit;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample4 {
	 public static void main(String[] args) 
     {
          Map<String, Integer> map = new HashMap<String, Integer>();
          map.put("T", 1);
          map.put("M", 2);

//          map.keySet().add("A",5);
          map.keySet().add("A");
          System.out.println(map.size());
    }
}

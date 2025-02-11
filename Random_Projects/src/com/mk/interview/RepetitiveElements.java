package com.mk.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepetitiveElements {
	public static void main(String[] args) {
          Integer[] i = new Integer[] {2,1,3,4,2,3,5,3};
          
          System.out.println("======distinct======");
         Arrays.asList(i).stream().distinct().sorted().forEach(System.out::println);
          
          System.out.println("====Duplicate Elements=====");
         Map<Integer,Integer> map = new HashMap<>();
         for(Integer n:i)
         {
        	 map.merge(n, 1,Integer::sum);
         }//for
         System.out.println(map.entrySet());
         Entry<Integer,Integer> max = Collections.max(map.entrySet(),Map.Entry.comparingByValue());
         System.out.println(max.getKey()+"-"+max.getValue());
          
	}//main
}//class
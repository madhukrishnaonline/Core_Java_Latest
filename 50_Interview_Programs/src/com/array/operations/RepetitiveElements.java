package com.array.operations;

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
          Map<Integer,Integer> map = new HashMap<Integer, Integer>();
          for(Integer n:i)
          {
        	  map.merge(n,1,Integer::sum);
          }//for
          System.out.println(map.entrySet());
          Entry<Integer, Integer> max = Collections.max(map.entrySet(),Map.Entry.comparingByValue());
          System.out.println(max.getKey()+"="+max.getValue());
          
			/* System.out.println("=====Sum=====");
			 Integer reduce = Arrays.asList(i).stream().reduce(0,Integer::sum);
			 System.out.println(reduce);*/
          
	}//main
}//class
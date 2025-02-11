package com.array.operations;

import java.util.HashSet;
import java.util.Set;

public class CollectionToArray {
	public static void main(String[] args) {
          Set<Integer> set = new HashSet<Integer>();
          set.add(2);
          set.add(3);
          set.add(1);
          set.add(5);
          set.add(5);
          set.add(4);
          Object[] array = set.toArray();

          for(Object i:array)
          {
        	  System.out.println(i);
          }//for
	}//main
}//class
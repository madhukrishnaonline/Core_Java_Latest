package com.streams;

import java.util.LinkedList;
import java.util.List;

public class Temp {
	public static void main(String[] args) {
       int first=0,second=1;
       int size=10;
       List<Integer> list = new LinkedList<>();
       list.add(first);
       list.add(second);
//       System.out.println(first);
//       System.out.println(second);
       for(int i=2;i<=size;i++) {
    	   int next=first+second;
    	   list.add(next);
//    	   System.out.println(next);
    	   first=second;
    	   second=next;
       }
       
       Integer sum = list.stream().limit(10).reduce(0,(a,b)->a+b);
       System.out.println(sum);
	}
}

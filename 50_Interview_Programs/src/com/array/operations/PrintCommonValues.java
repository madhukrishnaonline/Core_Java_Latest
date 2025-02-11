package com.array.operations;

import java.util.HashSet;
import java.util.Set;

public class PrintCommonValues {

	public static void main(String[] args) {
         Integer[] arr1 = new Integer[] {1,3,2,5,7};
         Integer[] arr2 = new Integer[] {1,2,4,6,7};
         
         Set<Integer> set1 = new HashSet<>();
         
         for(Integer i:arr1) {
             	 set1.add(i);
         }//for
         
         for(Integer i:arr2){
        	 if(set1.contains(i)) {
        		 System.out.println(i);
        	 }//if
         }//for
         
	}//main
}

package com.array.operations;

import java.util.Arrays;
import java.util.HashSet;

public class CompareArrays {
	public static void main(String[] args) {
		 int[] c = {1,2,3,4,5,6};
	     int[] d = {1,2,4,3,6,5};
	     
	     Arrays.sort(c); Arrays.sort(d);
	     System.out.println(Arrays.equals(c,d));
	     
	     System.out.println("=======Intersection of Two Arrays - using Iteratives==========");
	     String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
	     String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

	     HashSet<String> hashSet = new HashSet<String>();
	     for(int i=0;i<s1.length;i++)
	     {
	    	 for(int j=0;j<s2.length;j++)
	    	 {
	    		 if(s1[i].equals(s2[j])) 
	    		 {
//	    			 System.out.println(s1[i].equals(s2[j]));
	    			 hashSet.add(s1[i]);
	    		 }//if
	    	 }//inner loop
	     }//outer loop
	     System.out.println(hashSet);
	     hashSet.forEach(System.out::println);
	     
	     System.out.println("=======Intersection of Two Arrays - using retainAll()==========");
	     HashSet<String> hashSet1 = new HashSet<String>(Arrays.asList(s1));
	     HashSet<String> hashSet2 = new HashSet<String>(Arrays.asList(s2));
	     
	     hashSet1.retainAll(hashSet2);
	     System.out.println(hashSet1);
	     
	     
	     
	     
	}//main
}//class
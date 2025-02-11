package com.java.operators;

public class EqualOrNot {
      public static String equalOrNot(int x,int y) {
    	  if(x==y) {
    		  return "Equal";
    	  }//if
    	  else {
    		  return "Not Equal";
    	  }//else
      }
      
	public static void main(String[] args) {
     System.out.println(equalOrNot(12,12));
	}//main
}//class
package com.string.operations;

public class LengthOfTheLastWord {

	public static void main(String[] args) {
       String str = "Madhu Krishna ".strip();
       int len = 0;
       for(int i=str.length()-1;i>=0;i--) {
    	   char ch = str.charAt(i);
    	   if(ch==' ') {
    		   break;
    	   }//if
    	   else {
    		   len++;
    	   }//else
       }//for
       System.out.println(len);
	}//main

}//class
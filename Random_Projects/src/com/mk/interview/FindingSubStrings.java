package com.mk.interview;

public class FindingSubStrings {
	public static void main(String[] args) {
        String str = "madhu";
//        System.out.println(str.substring(1, 2));
        for(int i=0;i<=str.length();i++)
        {
        	for(int j=i+1;j<=str.length();j++)
        	{
        		System.out.println(str.substring(i, j));
        	}//inner loop
        }//outer loop
	}//main
}//class
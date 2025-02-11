package com.patterns;

public class NRowsColumnsStar {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
           for(int j=0;j<n;j++) {
        	   System.out.print("*");
           }//inner for
           System.out.println();
		}//outer
	}// main

}

package com.string.operations;

import java.util.StringTokenizer;

public class CountOfWords {
	public static void main(String[] args) {
		String str = "Madhu Krishna Kummari";
		StringTokenizer st= new StringTokenizer(str," ");
		System.out.println("Count of Words :: "+st.countTokens());
		while (st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken()+"- token ");
			System.out.println(st.countTokens());
		} // while
	}// main
}// class
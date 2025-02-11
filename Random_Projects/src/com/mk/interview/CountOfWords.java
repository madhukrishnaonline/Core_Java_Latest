package com.mk.interview;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ::");
		String str = sc.nextLine();
		System.out.println("Enter the delimeter :: ");
		String del = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(str, del);
		System.out.println("Count of Words :: "+tokenizer.countTokens());
		while(tokenizer.hasMoreElements())
		{
			 String nextToken = tokenizer.nextToken();
			 StringBuffer buffer = new StringBuffer(nextToken);
			 System.out.println(buffer.reverse());
		}//while
		System.out.println("Count of chars :: "+str.strip().chars().count());
		System.out.println("Count Distinct of chars :: "+str.chars().distinct().count());
		int count=0;
		for(int i=0;i<str.length();i++)
		{
//			char ch = str.charAt(i);
		    count++;
		}//for
		System.out.println(count);
		sc.close();
	}//main
}//class
package com.intStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operations {
	public static void main(String[] args) {
		System.out.println("Take input from 1 to 9 and print only 2 to 8");
         List<Integer> list = IntStream.rangeClosed(1,9).boxed().skip(1).limit(7).collect(Collectors.toList());
         System.out.println(list);         
         
         String str = "mam";
         int backward = str.length()-1;
         boolean allMatch = IntStream.range(0, str.length()).allMatch(forward->str.charAt(forward)==str.charAt(backward-forward));
         if(allMatch) {
        	 System.out.println("Palindrome String");
         }//if
         System.out.println("Not a Palindrome");
	}// main
}// class
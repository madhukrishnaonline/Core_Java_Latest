package com.mk.interview;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeJava8Streams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");   //mam
		String str = sc.nextLine();
		int k = str.length()-1;  //k=2
		System.out.println(IntStream.range(0,str.length())
				                            //position=012                  //charAt(0)->m ==     //k-positions = 2-0=2->m  //true
				                                                                           //charAt(1)->a ==     //k-positions = 2-1=1->a		//true		                                                                           
                                                                  			   	           //charAt(2)->m ==     //k-positions = 2-2=0->m	//true			                                                                           
				                           .allMatch(positions->str.charAt(positions)==str.charAt(k-positions)));
		
		sc.close();
	}//main

}// class
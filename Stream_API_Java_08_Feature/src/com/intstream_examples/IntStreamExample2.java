package com.intstream_examples;

public class IntStreamExample2 {
	public static void main(String[] args) {
       String str ="madhu";
       
       str.chars().mapToObj(c->(char)c).forEach(System.out::println);
	}
}

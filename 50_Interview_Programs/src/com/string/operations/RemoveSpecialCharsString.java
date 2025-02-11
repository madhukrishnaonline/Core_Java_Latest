package com.string.operations;

public class RemoveSpecialCharsString {
	public static void main(String[] args) {
         String str = "m@dh#&kr$h^*";
        String str2 = str.replaceAll("[^a-zA-Z0-9]","");
       System.out.println(str2);
	}//main
}//class
package com.stringOperations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOpeartions3 {

	public static void main(String[] args) {
         String str = "mommyo";
         
         String first = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                         .entrySet().stream().filter(value->value.getValue()==1).map(key->key.getKey()).findFirst().get();
         System.out.println(first);
         
         String str2 = "Madhu Krishna Madhu Krishna";
         int mid = str2.length()/2;
         System.out.println(mid);
         String lowerCase=" ";
         String upperCase=" ";
         for(int i=0;i<str2.length();i++) {
        	 if(i<mid) {
        		   lowerCase = lowerCase+Character.toLowerCase(str2.charAt(i));
        	 }//if
        	 else {
        		 upperCase = upperCase+Character.toUpperCase(str2.charAt(i));
        	 }//else
         }//for
         System.out.println(lowerCase+" "+upperCase);
         
	}//main
}//class
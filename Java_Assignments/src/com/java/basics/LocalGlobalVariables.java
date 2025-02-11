package com.java.basics;

public class LocalGlobalVariables {
     String str ;
     int age;
     
	public LocalGlobalVariables(String str, int age) {
		this.str = str;
		this.age = age;
	}//constructor

	public static void main(String[] args) {
		LocalGlobalVariables variables = new LocalGlobalVariables("Krishna",23);
		System.out.println(variables.str+"-"+variables.age);
	}//main
}//class
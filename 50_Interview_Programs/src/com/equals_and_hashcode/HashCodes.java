package com.equals_and_hashcode;

public class HashCodes {
	public static void main(String[] args) {
		Employee employee = new Employee(123, "Krishna", 30000);
		Employee employee2 = new Employee(123, "Krishna", 30000);
        
		System.out.println(employee.equals(employee2));
		System.out.println(employee.hashCode()+" "+employee2.hashCode());
	}// main
}// class
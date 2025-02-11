package com.hashcode;

import com.employee.Employee;

public class HashCodes 
{
	public static void main(String[] args) 
	{
		Employee employee = new Employee("krishna", "developer", 30000);
		Employee employee2 = new Employee("krishna","developer", 30000);
		
		System.out.println("====Our Hashcodes====");
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		
		System.out.println("====System Generated HashCodes====");
		System.out.println(System.identityHashCode(employee));
		System.out.println(System.identityHashCode(employee2));
		
	}//main
}//class
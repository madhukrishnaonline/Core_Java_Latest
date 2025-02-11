package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample 
{
	public static void main(String[] args) 
	{
		String names[] = {"madhu","krishna","madhavi","madhulatha","malaivika"};
		
		Predicate<String> predicate1 =  name->name.charAt(0)=='m';
		
		for(String name:names)
		{
			if(predicate1.test(name))
			{
				System.out.println(" "+name);
			}//if
		}//for
		
		Predicate<Integer> predicate2 = i->i>10;
		System.out.println(predicate2.test(20));
		
		
		PersonDetails details1 = new PersonDetails("madhu",23,876668758L);
		PersonDetails details2 = new PersonDetails("rama krishna",19,874645645L);
		PersonDetails details3 = new PersonDetails("akash",10,3488885688L);
		PersonDetails details4 = new PersonDetails("akshith",14,8656979898L);
		
		List<PersonDetails> list = Arrays.asList(details1,details2,details3,details4);
		Predicate<PersonDetails> predicate3 = age->age.getAge() > 20;
		
		list.forEach(ages->{
		     if(predicate3.test(ages)) {
		            System.out.println(ages.getName()); 	 
		     }
		});
		
		EmployeeDetails empDetails1 = new EmployeeDetails("mk123","madhu","Hyderabad",30000d);
		EmployeeDetails empDetails2 = new EmployeeDetails("kk143","krishna","Hyderabad",40000d);
		EmployeeDetails empDetails3 = new EmployeeDetails("lksh163","lokesh","Pune",50000d);
		EmployeeDetails empDetails4 = new EmployeeDetails("nsh123","naresh","Banglore",60000d);
		
		
		List<EmployeeDetails> empList = Arrays.asList(empDetails1,empDetails2,empDetails3,empDetails4);
		Predicate<EmployeeDetails> predicate4 = emp->emp.getLocations().equals("Hyderabad");
		Predicate<EmployeeDetails> predicate5 = emp->emp.getEname().equals("madhu");
		
//		Predicate<EmployeeDetails> predicate = predicate4.and(predicate5);
		Predicate<EmployeeDetails> predicate = predicate4.or(predicate5);
		
		empList.forEach(a->{
			      if(predicate.test(a))
			      {
			    	  System.out.println(a.geteId());
			      }
		});
		
		BiPredicate<Integer, Integer> biPredicate = (x,y)->{
			if(x>y || y<x)
			{
				System.out.println("x is Greater:: "+x);
				return true;
			}
			else if(y>x || x<y)
			{
				System.out.println("y is Greater :: "+y);
				return true;
			}
			else
			{
				System.out.println("Values are same....");
				return false;
			}
		};
		
		System.out.println(biPredicate.test(30, 30));
		
		
		
	}//main

}
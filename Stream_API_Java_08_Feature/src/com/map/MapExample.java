package com.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample 
{
	public static void main(String[] args) 
	{
		User user1 = new User("Madhu","mk123",23,30000);
  	    User user2 = new User("Balu","bl123",24,35000);
  	    User user3 = new User("Rama","rk123",19,25000);
  	    User user4 = new User("Lokesh","lk123",23,29000);
  	    User user5 = new User("Pranay","pry123",24,15000);
  	    
  	     Stream<User> stream2 = Stream.of(user1,user2,user3,user4,user5);
		 stream2.filter(employee->employee.sal>=30000)
				        .map(employee->employee.name +" "+employee.age)
				        .forEach(System.out::println);
		 
		 List<String> names = Arrays.asList("madhu","krishna","mia malkova","madhu latha","mia khalifa");
		 names.stream().filter(name->name.startsWith("m"))
			         .map(name->name.toUpperCase())
			         .map(name->name+"-"+name.length())
			         .forEach(System.out::println);
	
	}//main
}//class

class User
{
	public String name;
	public String id;
	public int age;
	public double sal;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public User(String name, String id, int age, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
}//class
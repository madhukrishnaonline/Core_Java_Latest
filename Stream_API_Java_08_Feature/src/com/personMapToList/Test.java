package com.personMapToList;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAadhar(365688809627L);
		p1.setName("Krishna");
		p1.setAge(23);
		Person p2 = new Person();
		p2.setAadhar(365699909627L);
		p2.setName("Madhu");
		p2.setAge(34);
		Person p3 = new Person();
		p3.setAadhar(365677709627L);
		p3.setName("Lakshmi");
		p3.setAge(22);
		Person p4 = new Person();
		p4.setAadhar(365666609627L);
		p4.setName("Prasanna");
		p4.setAge(24);
		
		Map<Long, Person> map = new HashMap<>();
		map.put(p1.getAadhar(), p1);
		map.put(p2.getAadhar(), p2);
		map.put(p3.getAadhar(), p3);
		map.put(p4.getAadhar(), p4);
		Person person = map.get(365666609627L);
		System.out.println(person);

		map.values().stream().filter(age->age.getAge()>33).forEach(System.out::println);
	}// main
}// class
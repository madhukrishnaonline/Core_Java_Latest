package com.personListToMap;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		
		Person p5 = new Person();
		p5.setAadhar(365688809627L); //duplicate key
		p5.setName("Prathyusha");
		p5.setAge(22);
		
		List<Person> list = new LinkedList<>();
		list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p5);
		
		/*Person person = list.stream().collect(Collectors.toMap(Person::getAadhar,Function.identity())).get(365688809627l);
		System.out.println(person);*/
		
		//keyclashes 
		/*Map<Long, Person> map = list.stream().collect(Collectors.toMap(person->person.getAadhar(),person->person,(a,b)->a));//when we has a same keys we can return the first old one(a) or new one(b) 
		Person person = map.get(365688809627l);
		System.out.println(person);
		System.out.println(map.getClass());*/
		
		Map<Long, Person> map = list.stream().collect(Collectors.toMap(person->person.getAadhar(),person->person,(a,b)->a,LinkedHashMap::new));//to change implementation class
		Person person = map.get(365688809627l);
		System.out.println(person);
		System.out.println(map.getClass());
	}// main
}// class
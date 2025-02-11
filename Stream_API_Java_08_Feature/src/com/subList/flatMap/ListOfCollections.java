package com.subList.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfCollections 
{
    public static void main(String[] args)
    {
    	
    	List<String> javaCourses = Arrays.asList("JAVASE","JAVAEE","SPRING FRAMEWORK","SPRING BOOT");
    	List<String> dbCourses = Arrays.asList("ORACLE DB","MONGO DB");
    	List<String> uiCourses = Arrays.asList("HTML","CSS","JS","SASS","BOOTSTRAP","JQUERY","TYPESCRIPT","ANGULAR");
    	
    	List<List<String>> courses = Arrays.asList(javaCourses,dbCourses,uiCourses);
    	System.out.println("================");
    	courses.stream().forEach(System.out::println);
    	System.out.println("================");
    	System.out.println("take the subList source and return as one List");
    	List<String> list2 = courses.stream().flatMap(courses1->courses1.stream().map(courseName->courseName.toLowerCase()))
    	                                .collect(Collectors.toList());
    	System.out.println(list2);
    	
    	System.out.println("print the java coureses names");
    	List<String> list3 =  courses.stream().flatMap(courses1->courses1.stream().map(courseName->courseName.toLowerCase()).filter(course2->course2.contains("java") || course2.contains("spring"))).collect(Collectors.toList());
    	System.out.println(list3);
    	
    	Persons persons1 = new Persons("Madhu","INDIA");
    	Persons persons2 = new Persons("Ching","CHINA");
    	Persons persons3 = new Persons("Afghar","AFRICA");
    	Persons persons4 = new Persons("Konk","KOREA");
    	Persons persons5 = new Persons("Japish","JAPAN");
    	Persons persons6 = new Persons("Lokesh","INDIA");
    	
    	System.out.println("================");
    	List<Persons> list = Arrays.asList(persons1,persons2,persons3,persons4,persons5,persons6);
//    	list.stream().filter(person->person.country.equals("INDIA")).collect(Collectors.toList()).forEach(System.out::println);
    	list.stream()
    	     .filter(person->person.country.equals("INDIA"))
    	     .map(name->name.name.toUpperCase())
    	     .collect(Collectors.toList()).forEach(System.out::println);
	}//main
}//class

class Persons {
	String name;
	String country;

	@Override
	public String toString() {
		return "Persons [name=" + name + ", country=" + country + "]";
	}

	public Persons(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

}//class
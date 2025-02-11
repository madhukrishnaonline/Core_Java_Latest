package com.matches;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingOperations 
{
	public static void main(String[] args) 
	{
		Persons persons1 = new Persons("Madhu","INDIA");
    	Persons persons2 = new Persons("Ching","CHINA");
    	Persons persons3 = new Persons("Afghar","AFRICA");
    	Persons persons4 = new Persons("Konk","KOREA");
    	Persons persons5 = new Persons("Japish","JAPAN");
    	Persons persons6 = new Persons("Lokesh","INDIA");
    	
    	System.out.println("================");
    	List<Persons> list = Arrays.asList(persons1,persons2,persons3,persons4,persons5,persons6);
    	boolean status1 = list.stream().allMatch(person->person.country.equals("INDIA"));
    	System.out.println("is all persons available from India :: "+status1);
    	
    	boolean status2 = list.stream().anyMatch(person->person.country.equals("INDIA"));
    	System.out.println("is any person available from India :: "+status2);
    	
    	boolean status3 = list.stream().noneMatch(person->person.country.equals("INDIA"));
    	System.out.println("None of persons available from India :: "+status3);
    	
    	System.out.println("=================");
    	Optional<Persons> findFirst = list.stream()
    			                                                     .filter(person->person.country.equals("INDIA"))
    			                                                     .findFirst();
    	if(findFirst.isPresent())
    	{
    		System.out.println(findFirst.get());
    	}//if
    	System.out.println("=================");
    	Optional<Persons> findAny = list.stream()
    			                                                     .filter(person->person.country.equals("INDIA"))
    			                                                     .findAny();
    	if(findAny.isPresent())
    	{
    		System.out.println(findAny.get());
    	}//if
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
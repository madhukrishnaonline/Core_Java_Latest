package com.sorting.options;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Madhu",95));
		list.add(new Student("Krishna",89));
		list.add(new Student("Subbu",68));
		list.add(new Student("Balu",99));
		list.add(new Student("Naresh",56));
		
		System.out.println("Before Sort");
		for (Student arr : list) {
			System.out.println(arr);
		}
		
		System.out.println("After Sort");
		Collections.sort(list);
		for (Student arr : list) {
			System.out.println(arr);
		}
		
		/*System.out.println("After Sort Descending");
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}*/
		
	}// main
}// class

class Student implements Comparable<Student> {
	private String name;
	private Integer marks;

	public Student(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(o.marks, this.marks);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}
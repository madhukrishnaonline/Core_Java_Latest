package com.custom.functional_interface1;

import java.util.function.Consumer;

public class ObjectCreationMain {
	public static void main(String[] args) {
		ObjectCreator creator = (id, name) -> new Student(id, name);
		Student student = (Student) creator.create(1, "John Doe");

		Consumer<String> consumer = name -> student.setName("John Cena");
		student.updateName(consumer);

		System.out.println("Updated Student Details");
		System.out.println(student);
	}
}

package com.threadlocal;

import java.util.Date;
import java.util.List;

@SuppressWarnings("deprecation")
public class StudentDump {
	private static Student student1 = new Student(123, "Krishna", new Date(2001 - 1900, 02, 13));
	private static Student student2 = new Student(223, "Lakshmi", new Date(2000 - 1900, 05, 18));
	private static Student student3 = new Student(323, "Bhuvana", new Date(2001 - 1900, 06, 23));
	private static Student student4 = new Student(123, "Prasanna", new Date(2001 - 1900, 04, 26));

	public static List<Student> getStudentData() {
		return List.of(student1, student2, student3, student4);
	}

	public static Student findById(Integer id) {
		for (Student student : getStudentData()) {
			if (student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}
}
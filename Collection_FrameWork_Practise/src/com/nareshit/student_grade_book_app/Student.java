package com.nareshit.student_grade_book_app;

public class Student {
	private String name;
	private Character grade;

	public Student(String name, Character grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected Character getGrade() {
		return grade;
	}

	protected void setGrade(Character grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

}

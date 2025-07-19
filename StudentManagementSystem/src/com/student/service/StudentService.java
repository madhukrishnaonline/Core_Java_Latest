package com.student.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.student.pojo.Student;

public interface StudentService {
	boolean addStudent();

	List<Student> viewAllStudents() throws InterruptedException, ExecutionException;
	
	void removeStudent(Integer id);
}
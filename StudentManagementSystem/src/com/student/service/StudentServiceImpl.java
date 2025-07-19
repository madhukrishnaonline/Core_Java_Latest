package com.student.service;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.student.pojo.Address;
import com.student.pojo.Student;
import com.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	private Scanner scanner;
	private StudentRepository<Integer, Student> repository;

	public StudentServiceImpl(Scanner scanner, StudentRepository<Integer, Student> repository) {
		this.scanner = scanner;
		this.repository = repository;
	}

	@Override
	public boolean addStudent() {
		System.out.println("Enter the Student Id:");
		int id = scanner.nextInt();
		System.out.println("Enter the Student Name:");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter the Student Age:");
		int age = scanner.nextInt();
		System.out.println("Enter the Student Grade:");
		scanner.nextLine();
		String grade = scanner.nextLine();
		System.out.println("Enter the Student City:");
		String city = scanner.nextLine();
		System.out.println("Enter the Student PinCode:");
		int pinCode = scanner.nextInt();
		System.out.println("Enter the Student State:");
		scanner.nextLine();
		String state = scanner.nextLine();

		Address address = new Address(city, pinCode, state);
		Student student = new Student(id, name, age, grade, address);

		Student student2 = repository.save(student);
		if (student2 != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Student> viewAllStudents() throws InterruptedException, ExecutionException {
		CompletableFuture<List<Student>> completableFuture = CompletableFuture.supplyAsync(() -> repository.findAll());
		List<Student> list = completableFuture.get();
		if (list.isEmpty()) {
			throw new RuntimeException("No Data Available");
		}
		return list;
	}

	@Override
	public void removeStudent(Integer id) {
		CompletableFuture.runAsync(() -> repository.deleteById(id)).exceptionally(exception -> {
			exception.printStackTrace();
			return null;
		});
	}
}
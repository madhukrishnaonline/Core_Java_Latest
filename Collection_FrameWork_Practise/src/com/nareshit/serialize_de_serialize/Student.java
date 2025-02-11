package com.nareshit.serialize_de_serialize;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5996524487922747105L;

	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;

	private Scanner scanner;

	public Student(Scanner scanner) {
		this.scanner = scanner;
	}

	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	public Student getStudentObject() throws ParseException {
		System.out.println("Enter Student id :: ");
		Integer id = scanner.nextInt();
		System.out.println("Enter Student name :: ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter Student fee :: ");
		Double fee = scanner.nextDouble();
		System.out.println("Enter Student date of Admission(dd-mm-yyyy) ::");
		scanner.nextLine();
		String admissiondate = scanner.nextLine();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
		Date date = format.parse(admissiondate.trim());
		return new Student(id, name, fee, date);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

}

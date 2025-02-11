package com.nareshit.student_grade_book_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeBook {

	public static void main(String[] args) {
       List<Student> listOfStudents = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       while(true) {
    	   System.out.println("1.Add Student Grade\n2.Remove Student Grade\n3.Exit");
    	   System.out.println("Enter your Choice");
    	   int choice = scanner.nextInt();
    	   switch(choice) {
    	   case 1:
    		   System.out.println("Enter Student name");
    		   String name = scanner.nextLine();
    		   scanner.nextLine();
    		   System.out.println("Enter Student Grade");
//    		   Character grade = scanner.next();
    		   
//    		   listOfStudents.add(new Student(name,grade));
    	   }
       }
	}

}

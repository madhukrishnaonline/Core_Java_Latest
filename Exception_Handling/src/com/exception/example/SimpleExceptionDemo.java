package com.exception.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter the first Integer");
			int first = scanner.nextInt();
			System.out.println("Enter the second Integer");
			int second = scanner.nextInt();
			System.out.println("You entered a = "+first+" and b = "+second);
			
		}catch(InputMismatchException e) {
			System.out.println("An InputMismatchException Occured");
			System.out.println("Message :"+e.getMessage());
			System.out.println("String Representation :"+e.toString());
			e.printStackTrace();
		}//catch
		
		
	}

}

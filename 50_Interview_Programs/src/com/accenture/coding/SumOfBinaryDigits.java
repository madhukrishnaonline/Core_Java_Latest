package com.accenture.coding;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfBinaryDigits {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the Number");
         int num = scanner.nextInt();
         System.out.println("Binary Format");
         String binary = Integer.toBinaryString(num);
         System.out.println(binary);
         int sum = Arrays.asList(binary.split("")).stream().mapToInt(Integer::parseInt).reduce(0, (a,b)->a+b);
         System.out.println("Sum of Binary :: "+sum);
         
         scanner.close();
	}//main
}//class
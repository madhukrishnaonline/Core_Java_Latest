package com.number.operations;

import java.util.Scanner;
import static java.lang.Math.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt(); //153
		int original = num; //153
		int length = String.valueOf(num).length();
		int sum = 0;
		while (num != 0) { 
			int digit = num % 10;   //153%10=3 last digit, 2nd iter 15%10=5 last digit, 3rd iter 1%10=1 last digit
			sum += pow(digit, length); //(3,3)=3 cube = 27, (5,3)=5 cube=125, (1,3)=1 cube =1
			num/=10; //  153/10 = 15 , 15/10=1,1/10=0
		} // while
		if(sum==original) {
			System.out.println("Armstrong Number");
		}//if
		else {
			System.out.println("Not a Armstrong Number");
		}
		scanner.close();
	}//main

}

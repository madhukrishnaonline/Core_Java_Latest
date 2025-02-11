package main;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int size = sc.nextInt();
		int res = 1;
		for(int i=2;i<=size;i++) {
			res*=i;
		}//for
		System.out.println("Factorial of "+size+" is ::"+res);
		sc.close();
	}// maim
}// class
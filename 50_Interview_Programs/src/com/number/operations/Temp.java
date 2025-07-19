package com.number.operations;

public class Temp {

	public static void main(String[] args) {
		int num = 453;
		int reverse=0;
		while(num!=0) {
			int lastDigit = num%10;
			reverse=reverse*10+lastDigit;
			num/=10;
		}
		System.out.println(reverse);
	}// main
}// class
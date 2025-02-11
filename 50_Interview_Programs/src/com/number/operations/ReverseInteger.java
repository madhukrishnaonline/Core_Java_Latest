package com.number.operations;

public class ReverseInteger {
	public static int reverseInteger(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove the last digit from num
        }//while
        
        return reversed;
    }
	public static void main(String[] args) {
		int Integer = reverseInteger(4556778);
		System.out.println(Integer);
	}//main

}

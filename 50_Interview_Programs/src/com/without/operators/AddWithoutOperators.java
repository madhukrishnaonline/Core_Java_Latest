package com.without.operators;

public class AddWithoutOperators {
	public static int add(int a, int b) {
		while (b != 0) {
			// Carry now contains common set bits of a and b
			//Bitwise AND (&): This operation identifies bits that are 1 in both numbers, effectively calculating the carry.
			int carry = a & b;
		
			// Sum of bits of a and b where at least one of the bits is not set
			//Bitwise XOR (^): This adds the bits without considering the carry.
			a = a ^ b;
		
			// Carry is shifted by one so that adding it to a gives the required sum
			//Left Shift (<<): This moves the carry to the left by one position, so it can be added to the result in the next iteration.
			b = carry << 1;
			//This loop continues until there is no carry left, and the result in a will be the sum of the two numbers.
		}
		return a;
		
//		return a^b;
	}

	public static void main(String[] args) {
		int num1 = 3345;
		int num2 = 55;
		int i = add(num1, num2);
		System.out.println("Sum: " + i); // Output will be 12
	}// main
}// class
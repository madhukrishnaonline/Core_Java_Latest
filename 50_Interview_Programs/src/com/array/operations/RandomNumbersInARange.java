package com.array.operations;

import java.util.Random;

public class RandomNumbersInARange {
	public RandomNumbersInARange() {
		super();
	}
	public static void main(String[] args) {
		
		Random random = new Random();
	
		for (int i = 2; i < 6; i++) {
			String ran = random.nextInt(i)+" ";
			System.out.print(ran);
		} // for
		
	}// main
}// class
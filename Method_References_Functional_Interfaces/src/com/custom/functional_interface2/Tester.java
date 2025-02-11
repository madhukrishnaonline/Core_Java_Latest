package com.custom.functional_interface2;

import java.util.function.UnaryOperator;

public class Tester {
	public static void main(String[] args) {
		ClassRoom classRoom = new ClassRoom(100);
		System.out.println("Initial no.of Chairs :: "+classRoom);
		
		UnaryOperator<ClassRoom> adjustChairs = ClassRoom.adjustChairs(classRoom);
		ClassRoom classRoom2 = adjustChairs.apply(new ClassRoom());
		
		System.out.println("Updated no.of Chairs :: "+classRoom2);
	}
}

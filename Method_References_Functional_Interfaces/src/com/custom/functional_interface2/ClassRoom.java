package com.custom.functional_interface2;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ClassRoom {
	private int chairs;

	public ClassRoom(int chairs) {
		this.chairs = chairs;
	}

	public ClassRoom() {	}

	public static UnaryOperator<ClassRoom> adjustChairs(ClassRoom room) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No.Of Students");
		int count = scanner.nextInt();
		if (count == room.chairs) {
			System.out.println("No adjustments were made");
		} // if
		else if (count > room.chairs) {
			int adjustedChairs = count - room.getChairs();
			room.setChairs(count);
			System.out.println(adjustedChairs+ " no.of chairs were Increased");
		} // else if
		else if (count < room.chairs) {
			int adjustedChairs = room.getChairs() - count;
			room.setChairs(count);
			System.out.println(adjustedChairs+ " no.of chairs were Descreased");
		} // else if
		scanner.close();
		return clazz -> room;
	}

	protected int getChairs() {
		return chairs;
	}

	protected void setChairs(int chairs) {
		this.chairs = chairs;
	}

	@Override
	public String toString() {
		return "ClassRoom [chairs=" + chairs + "]";
	}

}//class
package com.records;

//Canonical Constructor
public record Person(String name, Integer age) {
	private static boolean brain;
	static {
		brain = true;
	}

	boolean person() {
		return brain;
	}

	// compact Constructor
	public Person {
		if (age < 18) {
			System.err.println("Not Allowed");
		} // if
	}
}//record
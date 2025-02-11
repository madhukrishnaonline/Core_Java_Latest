package com.inheritance.exception;

public class ChildClass extends ParentClass {

	public void loadingClass(String className) throws ClassNotFoundException {
		if (className.isEmpty() || className.isBlank()) {
			throw new IllegalArgumentException("Class name cannot be empty");
		}
		try {
			super.loadingClass(className);
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
			e.printStackTrace();
			throw e;
		}
	}
}

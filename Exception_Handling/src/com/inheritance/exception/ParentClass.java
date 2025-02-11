package com.inheritance.exception;

public class ParentClass {
	public void loadingClass(String className) throws ClassNotFoundException {
		Class<?> clazz = Class.forName(className);
		System.out.println("Class Loaded Successfully :: " + clazz.getClass().getName());
	}
}

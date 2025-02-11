package com.interfaces;

public class Temp {
	public static void main(String[] args) {
      Parent child =new Child();
      child.printAge();
	}
}

class Parent {
	public int getAge() {
		return 32;
	}

	public void printAge() {
		System.out.println(this.getAge());
	}
}

class Child extends Parent {
	@Override
	public int getAge() {
		return 22;
	}
}

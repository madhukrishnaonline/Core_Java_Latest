package main;

import test.ClassA2;
import test.ClassB2;

public class ClassC2 
{
    @SuppressWarnings("static-access")
	public static void main(String[] args) {
		ClassA2 ca = new ClassA2();
		ClassA2 cb = new ClassB2();
		System.out.println(ca.a +" "+ca.b+" "+cb.c+" "+cb.d);
	}
}

package com.constructor;

import java.lang.reflect.Constructor;

public class CountObjects {
	static int count = 0;

	public CountObjects() {
		count++;
	}

	public CountObjects(int a) {
		this();
	}

	public CountObjects(int a, int b) {
		this(a);
	}
	

	public static void main(String[] args) {
		CountObjects objects1 = new CountObjects();
		CountObjects objects2 = new CountObjects(5);
		CountObjects objects3 = new CountObjects(5, 5);
		System.out.println(count);
		/*Class<CountObjects> clazz = CountObjects.class;
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		for(Constructor con:constructors) {
			System.out.println(con);
		}//for
		*/
	}

}

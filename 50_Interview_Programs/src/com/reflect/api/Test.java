package com.reflect.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchFieldException, SecurityException {
		Class<?> clazz = Class.forName("com.reflect.api.User");
//        Object newInstance = clazz.newInstance();
		Constructor<?>[] con = clazz.getDeclaredConstructors();
		Object instance = con[1].newInstance(123, "Krishna", 1234567890l);
		System.out.println(instance);

		System.out.println("After Making them accessible");
		Field[] fields2 = clazz.getDeclaredFields();
		Field.setAccessible(fields2, true);
		for (Field field : fields2) {
			System.out.print(field.get(instance)+" ");
		}
		
		System.out.println();
        Method[] methods = clazz.getDeclaredMethods();
        Method.setAccessible(methods, true);
        for(Method method:methods) {      	
        	System.out.println(method.invoke(instance));
        }
        
		con[0].setAccessible(true);
		Object instance2 = con[0].newInstance();
		System.out.println(instance2);
	}
}
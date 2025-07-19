package com.object;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, IOException {
		System.out.println("Using new KeyWord");
		Employee employee = new Employee();
		System.out.println(employee);

		System.out.println("Using newInstance of Class");
		Class<?> clazz = Class.forName("com.object.Employee");
		Object instance = clazz.newInstance();
		System.out.println(instance);

		System.out.println("Using newInstance of Constructor");
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		Object instance2 = constructors[0].newInstance();
		System.out.println(instance2);

		System.out.println("By Using Cloning");
		Employee clone = (Employee) employee.clone();
		System.out.println(clone);

		/*FileOutputStream outputStream = new FileOutputStream(new File("M:\\Employee.txt"));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(clone);
		System.out.println("Stored in File");*/
        
        System.out.println("Using De-Serialization");
        FileInputStream fileInputStream = new FileInputStream(new File("M:\\Employee.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        System.out.println(object);
	}
}
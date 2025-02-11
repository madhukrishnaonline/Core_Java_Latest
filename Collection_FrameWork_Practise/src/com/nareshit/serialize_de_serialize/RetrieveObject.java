package com.nareshit.serialize_de_serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class RetrieveObject {
	public static void main(String[] args) {
		File file = new File("M:\\Student.txt");
		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
			List<Student> object = (List<Student>)objectInputStream.readObject();
          System.out.println(object);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

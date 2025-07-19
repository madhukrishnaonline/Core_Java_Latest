package com.io.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationObject {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(new File("M:\\Family.txt"));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		try (fileOutputStream; objectOutputStream) {
			Family family = new Family("Krishna",25);
			objectOutputStream.writeObject(family);
			System.out.println("Completed");
		}
	}
}
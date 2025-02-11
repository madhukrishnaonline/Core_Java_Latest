package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) {
		try {
			SerializableTest ser = new SerializableTest();
			FileOutputStream fos = new FileOutputStream("ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ser);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
	}//main
}//class
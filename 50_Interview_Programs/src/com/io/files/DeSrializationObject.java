package com.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSrializationObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream= new FileInputStream(new File("M:\\Family.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try(fileInputStream;objectInputStream){
        	Family family = (Family)objectInputStream.readObject();
        	System.out.println(family);
        }
	}
}
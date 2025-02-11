package com.io.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBody;

public class ReadTextFromDocx {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the File Path");
		String path = scanner.nextLine();
		File source = new File(path);
	    FileInputStream fileInputStream = new FileInputStream(source);
	    XWPFDocument document = new XWPFDocument(fileInputStream);
	    
	    //Extract Text from the Document
	    CTBody body = document.getDocument().getBody();
	    String text = body.xmlText();
	    System.out.println(text);
	    
	    document.close();
		fileInputStream.close();
		scanner.close();
	}

}

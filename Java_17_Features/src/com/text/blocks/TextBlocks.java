package com.text.blocks;

import java.util.List;
import java.util.stream.Stream;

public class TextBlocks {
	static String str = "KDHFVKJSDVDK";

	static String str2 = """
			                   {
			                      "name":"madhu Krishna"
			                      "status":"Single"
			                   }
			""";

	static String msg = """
			 String greet = "Hello World";
			 System.out.println(greet);
			""";
	static String html = """
			<html>
			    <body>
			        <h1>Hello World.</h1>
			    </body>
			</html>
			""";

	static String name = """
			String name =
			\"""  Madhu Krishna  \"""
			""".replaceAll("\n", " ").replaceAll("  ", "");

	static String data = " \"\"\"Users Data\"\"\"";

	/*	String output = """
				Name: %s
				Phone: %s
				Address: %s
				Salary: $%.2f
				""".formatted(name, phone, address, salary);
	*/
	public static void main(String[] args) {
//		System.out.println( str2);
		Stream<String> lines = str2.lines();
		List<String> list = lines.toList();
		if (list.contains("\"name\":\"madhu krishna\"")) {
			System.out.println("true");
		}
//		System.out.println("\"name\":\"Madhu Krishna\"");
		System.out.println(msg);
		System.out.println(html);
		System.out.println(name);
		System.out.println(data);
	}// main
}// class
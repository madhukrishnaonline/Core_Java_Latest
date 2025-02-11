package com.naresh.list.mcqs;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] argv) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.indexOf("a"));
		System.out.println(list.indexOf("c"));
		System.out.println(list.indexOf("d"));
	}
}
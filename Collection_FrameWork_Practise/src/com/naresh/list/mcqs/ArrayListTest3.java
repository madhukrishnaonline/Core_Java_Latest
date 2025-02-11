package com.naresh.list.mcqs;

import java.util.ArrayList;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		list.add(0, "A");
		list.add(1, "C");
		list.add(3, "B");
		System.out.println(list);
	}
}
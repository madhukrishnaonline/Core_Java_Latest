package com.naresh.list.mcqs;

import java.util.ArrayList;

public class ArrayListTest6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		/*list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');*/
		list.remove('c');
		System.out.println(list);
	}
}
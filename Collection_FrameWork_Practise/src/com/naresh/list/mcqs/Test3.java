package com.naresh.list.mcqs;

import java.util.*;

public class Test3 {
	public static void main(String[] args) {
		Integer int1 = new Integer(10);
		Vector vec1 = new Vector();
		LinkedList list = new LinkedList();
		vec1.add(int1);
		list.add(int1);
		if (list.equals(vec1))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}
}

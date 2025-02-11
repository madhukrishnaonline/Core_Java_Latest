package com.naresh.list.mcqs;

import java.util.*;

public class Test7 {
	public static void main(String argv[]) {

		ArrayList<String> list = new ArrayList();
//		list = new ArrayList();
		ArrayList<String> listStr = list;
		ArrayList<String> listBuf = list;
		list.add("world");
		listStr.add(0, "Hello");
		StringBuffer buff = new StringBuffer(listBuf.get(0)+listStr.get(1));
		System.out.println(buff.toString());
	}

}
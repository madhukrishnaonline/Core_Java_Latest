package com.own.datastructures;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();
       list.add("Kummari");
       list.add("Madhu");
       list.add("Krishna");
       System.out.println("Element at index: "+list.get(2));
       list.forEach();
       System.out.println("Size :: "+list.size());
       
	}
}
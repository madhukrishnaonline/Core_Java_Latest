package com.list;

public class LinkedList<T> {

	Node<T> head;

	static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}//static class

	public static <T> LinkedList<T> add(LinkedList<T> list, T data) {
		Node<T> newNode = new Node<T>(data);
		if (list.head == null) {
			list.head = newNode;
		} // if
		else {
			Node<T> last = list.head;
			while (last.next != null) {
				last = last.next;
			} // while
			last.next = newNode;
		} // else
		return list;
	}

	public static <T> void print(LinkedList<T> list) {
		Node<T> currentNode = list.head;
		while (currentNode!=null) {
           System.out.println(currentNode.data);
           currentNode=currentNode.next;
		} // while
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
          add(list, "madhu");
          add(list, "krishna");
          add(list, "kummari");
          print(list);
	}
}// class
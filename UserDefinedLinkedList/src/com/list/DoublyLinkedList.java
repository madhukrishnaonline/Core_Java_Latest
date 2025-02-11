package com.list;

public class DoublyLinkedList<T> {

	// Node class for doubly linked list
	static class Node<T> {
		T data; // Data of generic type
		Node<T> next; // Next node reference
		Node<T> prev; // Previous node reference

		// Constructor to create a new node
		public Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	// Head and Tail of the doubly linked list
	Node<T> head;
	Node<T> tail;

	// Method to add a node at the end of the list
	public void add(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			// If list is empty, make the new node both the head and tail
			head = newNode;
			tail = newNode;
		} else {
			// Link the new node at the end of the list and update the tail
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	// Method to add a node at the beginning of the list
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			// Link the new node at the beginning of the list and update the head
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	// Method to print the list from head to tail
	public void printForward() {
		Node<T> current = head;

		System.out.print("Doubly Linked List (Forward): ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	// Method to print the list from tail to head
	public void printBackward() {
		Node<T> current = tail;

		System.out.print("Doubly Linked List (Backward): ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println();
	}

	// Method to remove a node with specific data
	public void remove(T data) {
		Node<T> current = head;

		// Find the node to be removed
		while (current != null && !current.data.equals(data)) {
			current = current.next;
		}

		if (current == null) {
			System.out.println("Element not found!");
			return;
		}

		// If it's the only node
		if (current == head && current == tail) {
			head = null;
			tail = null;
		}
		// If the node is the head
		else if (current == head) {
			head = head.next;
			head.prev = null;
		}
		// If the node is the tail
		else if (current == tail) {
			tail = tail.prev;
			tail.next = null;
		}
		// If the node is in the middle
		else {
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

		// Adding elements to the list
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.addFirst(5);

		// Printing list forward and backward
		dll.printForward(); // Output: 5 10 20 30
		dll.printBackward(); // Output: 30 20 10 5

		// Removing element and printing again
		dll.remove(20);
		dll.printForward(); // Output: 5 10 30
		dll.printBackward(); // Output: 30 10 5
	}
}
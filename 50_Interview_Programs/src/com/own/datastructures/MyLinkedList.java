package com.own.datastructures;

import java.util.function.Consumer;

public class MyLinkedList<E> {
	private Node<E> head, tail;
	private int size;

	private static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E element) {
			this.element = element;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node [element=" + element + ", next=" + next + "]";
		}

	}

	public MyLinkedList() {
		this.head = tail = null;
	}

	public boolean add(E element) {
		Node<E> newElement = new Node<>(element);
		if (head == null) {
			head = tail = newElement;
		} else {
			tail.next = newElement;
			tail = newElement;
		}
		size++;
		return true;
	}

	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		Node<E> current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.element;
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(index);
		}
		if (index == 0) {
			head = head.next;
			if (head == null) {
				tail = null;
			}
		} else {
			Node<E> current = head;
			for (int i = 0; i <index-1; i++) {
				current = current.next;
			}
		}
	}

	public void forEach() {
		Node<E> temp = head;
		while (temp != null) {
			System.out.println(temp.element);
			temp = temp.next;
		}
	}

	public int size() {
		return size;
	}
}
package com.loops;

public class Even10To100While {

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while (true) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			} // if
			if (i == 100) {
				break;
			} // if
			i++;
		} // while
		System.out.println("Count of Even Numbers "+count);
	}

}

package com.loops;

public class Print1To10DoWhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			if (i == 10) {
				break;
			} // if
			i++;
		} while (true);

	}

}

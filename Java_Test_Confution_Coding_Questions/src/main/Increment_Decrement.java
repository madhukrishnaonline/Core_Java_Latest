package main;

public class Increment_Decrement {
public static void main(String[] args) {
	int x = 5;
	int y = ++x + ++x - x-- + ++x;
	System.out.println(y);
}
}

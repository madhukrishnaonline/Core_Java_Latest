package main;

public class Arithematic {
public static void main(String[] args) {
	int i = 10;
	try {
	           i = i/2;
	}
	catch(ArithmeticException ae)
	{
		System.out.println("ArithmeticException");
	}
	catch(Exception e)
	{
		System.out.println("Exception");
	}
}
}

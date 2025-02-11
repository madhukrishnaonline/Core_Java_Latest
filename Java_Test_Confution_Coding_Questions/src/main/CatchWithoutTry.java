package main;

public class CatchWithoutTry {
	public static void main(String[] args) {
		try {
//			int i = 1 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}// main
}// class
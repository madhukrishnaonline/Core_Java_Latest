package com.exception.example;

public class CommandLineDivision {

	public static void main(String[] args) {
		try {
			int dividend = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			if (dividend < 0 || divisor < 0) {
				throw new IllegalArgumentException("negavtive numbers not allowed");
			} // if
			try {
				int result = dividend/divisor;
				System.out.println("Division result: "+result);
				System.out.println("Division operation completed.");
			}catch(ArithmeticException ae) {
				System.out.println("Arithmetic Error :"+ae.getMessage());
				System.out.println("Division operation completed.");
			}
		} // try
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

}

package com.financial_transaction.exception;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		FinancialTransaction transaction = new FinancialTransaction();
		Scanner scanner = new Scanner(System.in);
        try(scanner){
        	System.out.println("Enter the Amount to transfer");
        	String amount = scanner.nextLine();
        	System.out.println("Enter the Account Number to transfer");
        	String accNumber = scanner.nextLine();
        	double transactionAmount = Double.parseDouble(amount);
        	long accountNumber = Long.parseLong(accNumber);
        	transaction.processTransaction(transactionAmount, accountNumber);
        }catch(Exception e) {
        	if(e instanceof NumberFormatException) {
        		System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        	}
        	System.out.println(e.toString());
        }
	}

}

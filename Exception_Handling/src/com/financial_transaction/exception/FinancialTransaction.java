package com.financial_transaction.exception;

public class FinancialTransaction {
	public void processTransaction(double amount, Long accountNumber) {
		try {
			if (amount <= 0) {
				throw new IllegalArgumentException("Error processing transaction: Transaction amount must be positive");
			} else if (String.valueOf(accountNumber).length() != 10) {
				throw new IllegalArgumentException("Error processing transaction: invalid account number");
			}
			System.out.println("Processing transaction...");
			System.out.println(
					"Transaction successful: Amount Rs." + amount + " transferred to account " + accountNumber);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.toString());
		} catch (IllegalArgumentException iae) {
			System.out.println(iae.toString());
		} catch (RuntimeException re) {
			System.out.println(re.toString());
		}
	}
}

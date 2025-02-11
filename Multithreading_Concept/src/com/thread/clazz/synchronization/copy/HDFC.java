package com.thread.clazz.synchronization.copy;

public class HDFC {
	private static Double currentBalance = 4000d;

	static public synchronized void withdraw(Double amountToBeWithdrawn) {
		currentBalance = currentBalance - amountToBeWithdrawn;
	}

	static public synchronized void deposite(Double amountToBeDeposited) {
		currentBalance = currentBalance + amountToBeDeposited;
	}

	static public synchronized Double checkBalance() {
		return currentBalance;
	}

}

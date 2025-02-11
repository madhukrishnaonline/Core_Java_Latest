package com.thread.object.synchronization;

public class HDFC {
	private Double currentBalance;

	public HDFC(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public synchronized void withdraw(Double amountToBeWithdrawn) throws InterruptedException {
		if(amountToBeWithdrawn>currentBalance) {
			wait();
			wait(20000);
		}
		currentBalance = this.currentBalance - amountToBeWithdrawn;
	}

	public synchronized void deposite(Double amountToBeDeposited) {
		currentBalance = this.currentBalance + amountToBeDeposited;
		notifyAll();
	}

	public synchronized Double checkBalance() throws InterruptedException {
		Thread.sleep(10000);
		return this.currentBalance;
	}

}

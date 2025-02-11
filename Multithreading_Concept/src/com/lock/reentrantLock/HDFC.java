package com.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HDFC {
	private Double currentBalance;

//	private Lock lock = new ReentrantLock();
	private Lock lock = new ReentrantLock(true);
	
	
	public HDFC(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public void withdraw(Double amountToBeWithdrawn) {
		lock.lock();
		currentBalance = this.currentBalance - amountToBeWithdrawn;
		lock.unlock();
	}

	public void deposite(Double amountToBeDeposited) {
		lock.lock();
		currentBalance = this.currentBalance + amountToBeDeposited;
		lock.unlock();
	}

	public Double checkBalance() {
		lock.lock();
		Double bal = this.currentBalance;
		lock.unlock();
		return bal;
	}

}

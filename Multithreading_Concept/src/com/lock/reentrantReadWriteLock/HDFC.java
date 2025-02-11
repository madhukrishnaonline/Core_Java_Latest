package com.lock.reentrantReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HDFC {

	private Integer profileId;
	private Double currentBalance;

//	private ReadWriteLock lock= new ReentrantReadWriteLock();
	private ReadWriteLock lock = new ReentrantReadWriteLock(true);

	public HDFC(Double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public void withdraw(Double amountToBeWithdrawn) {
		lock.writeLock().lock();
		currentBalance = this.currentBalance - amountToBeWithdrawn;
		lock.writeLock().unlock();
	}

	public void deposite(Double amountToBeDeposited) {
		lock.writeLock().lock();
		currentBalance = this.currentBalance + amountToBeDeposited;
		lock.writeLock().unlock();
	}

	public Double checkBalance() {
		lock.readLock().lock();
		Double bal = this.currentBalance;
		lock.readLock().unlock();
		return bal;
	}

	public Integer viewProfile() {
		lock.readLock().lock();
		Integer id = this.profileId;
		lock.readLock().unlock();
		return id;
	}

}

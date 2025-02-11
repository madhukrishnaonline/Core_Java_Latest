package com.lock.reentrantReadWriteLock;

public class MainClass {

	public static void main(String[] args) {
		HDFC madhu = new HDFC(5000d);
		Thread thread1 = new Thread(() -> madhu.withdraw(5000d), "ATM-Thread-Madhu");
		Thread thread2 = new Thread(() -> madhu.deposite(5000d), "Phonepe-Thread-Madhu");
		Thread thread3 = new Thread(() -> madhu.checkBalance(), "GogglePay-Thread-Madhu");
		Thread thread4 = new Thread(() -> madhu.viewProfile(), "Paytm-Thread-Madhu");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}// main
}

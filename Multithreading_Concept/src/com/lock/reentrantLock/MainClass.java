package com.lock.reentrantLock;

public class MainClass {

	public static void main(String[] args) {
		HDFC madhu = new HDFC(5000d);
		HDFC krishna = new HDFC(5000d);
		Thread thread1 = new Thread(() -> madhu.withdraw(5000d), "ATM-Thread-Madhu");
		Thread thread2 = new Thread(() -> madhu.deposite(5000d), "Phonepe-Thread-Madhu");
		Thread thread3 = new Thread(() -> madhu.checkBalance(), "GogglePay-Thread-Madhu");

		Thread thread4 = new Thread(() -> krishna.withdraw(5000d), "ATM-Thread-Krishna");
		Thread thread5 = new Thread(() -> krishna.deposite(5000d), "GogglePay-Thread-Krishna");
		Thread thread6 = new Thread(() -> krishna.checkBalance(), "PhonePe-Thread-Krishna");

		thread1.start();
		thread2.start();
		thread3.start();

		thread4.start();
		thread5.start();
		thread6.start();
	}// main
}

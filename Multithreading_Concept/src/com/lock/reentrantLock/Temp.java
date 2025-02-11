package com.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Temp {

	private Lock lock = new ReentrantLock();

	public int value(int num) {
		lock.lock();
		int n;
		try {
			n = num / 0;
		} // try
		finally {
			lock.unlock();
		} // finally
		return n;
	}
	
	public void print() {
		lock.lock();
		System.out.println("Temp.print()");
		lock.unlock();
	}

	public static void main(String[] args) {
		Temp temp = new Temp();

		Thread thread1 = new Thread(() -> temp.value(5), "Thread-1");
		Thread thread2 = new Thread(() -> temp.value(0), "Thread-2");

		thread1.start();
		thread2.start();

	}// main
}

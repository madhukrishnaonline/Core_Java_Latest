package com.thread.clazz.synchronization.copy;

public class ATMThread extends Thread {
	public ATMThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("ATMThread.run()");
		HDFC.withdraw(4000d);
	}
}

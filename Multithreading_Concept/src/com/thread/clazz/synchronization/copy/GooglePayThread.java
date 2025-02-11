package com.thread.clazz.synchronization.copy;

public class GooglePayThread extends Thread {

	public GooglePayThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("GooglePayThread.run()");
		HDFC.deposite(4000d);
	}
}

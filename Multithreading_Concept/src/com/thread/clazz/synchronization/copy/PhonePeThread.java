package com.thread.clazz.synchronization.copy;

public class PhonePeThread extends Thread {

	public PhonePeThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("PhonePeThread.run()");
		System.out.println(HDFC.checkBalance());
	}
}

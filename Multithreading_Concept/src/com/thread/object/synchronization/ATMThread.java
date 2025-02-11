package com.thread.object.synchronization;

public class ATMThread extends Thread {
	private HDFC hdfc;

	public ATMThread(HDFC hdfc,String name) {
		super(name);
		this.hdfc = hdfc;
	}

	@Override
	public void run() {
		System.out.println("ATMThread.run()");
		try {
			hdfc.withdraw(7000d);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package com.thread.object.synchronization;

public class GooglePayThread extends Thread {
	private HDFC hdfc;

	public GooglePayThread(HDFC hdfc,String name) {
		super(name);
		this.hdfc = hdfc;
	}

	@Override
	public void run() {
		System.out.println("GooglePayThread.run()");
		hdfc.deposite(4000d);
	}
}

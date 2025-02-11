package com.thread.object.synchronization;

public class PhonePeThread extends Thread {
	private HDFC hdfc;

	public PhonePeThread(HDFC hdfc,String name) {
		super(name);
		this.hdfc = hdfc;
	}

	@Override
	public void run() {
		try {
			System.out.println("PhonePeThread.run()");
			System.out.println(hdfc.checkBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

package com.thread.clazz.synchronization.copy;

public class MainClass {

	public static void main(String[] args) {
		
		ATMThread atm = new ATMThread("ATM-Thread");
		GooglePayThread gPay = new GooglePayThread("GooglePay-Thread");
		PhonePeThread phonePe = new PhonePeThread("Phonepe-Thread");
		
		atm.start();
		gPay.start();
		phonePe.start();
	}

}

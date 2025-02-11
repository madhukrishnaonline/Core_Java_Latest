package com.thread.object.synchronization;

public class MainClass {

	public static void main(String[] args) {
		HDFC krishna = new HDFC(6000.50);
		HDFC madhu = new HDFC(6000.50);
		
		ATMThread atm1 = new ATMThread(krishna,"ATM1-Krishna-Thread");
		ATMThread atm2 = new ATMThread(krishna,"ATM2-Krishna-Thread");
		ATMThread atm3 = new ATMThread(madhu,"ATM3-Madhu-Thread");
		GooglePayThread gPay = new GooglePayThread(krishna,"GooglePay-Krishna-Thread");
		PhonePeThread phonePe = new PhonePeThread(madhu,"Phonepe-Madhu-Thread");
		
		atm1.start();
		atm2.start();
		atm3.start();
		gPay.start();
		phonePe.start();
	}

}

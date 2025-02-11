package com.mobile.impl;

import java.util.Scanner;

import com.mobile.MobilePhone;
import com.sim.SIM;

public class RealMeMobile implements MobilePhone {

	private SIM sim;
	private Scanner scanner;

	public RealMeMobile(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void insertSim(SIM sim) {
		this.sim = sim;
		/*String name = sim.getClass().getName();
		int len = name.length();
		String provider = name.substring(13,len);*/
		System.out.println(sim.networkProvider() + " SIM Card Inserted Successfully");
		sim.activation();
	}

	@Override
	public void makeCall() throws InterruptedException {
		if (sim != null) {
			System.out.println("Enter Mobile Number to Call");
			long mobile = scanner.nextLong();
			if (String.valueOf(mobile).length() == 10 && !sim.gettingMobileNumber().equals(mobile)) {
				System.out.println("Making call to " + sim.gettingMobileNumber() + " using " + mobile);
				Thread.sleep(2000);
				System.out.println("Call Made");
			} // if
			else {
				System.err.println("Invalid Mobile");
			} // else
		} // if
		else {
			System.err.println("No SIM Card Detected,Insert SIM Card to make a Call");
		} // else
	}

	@Override
	public void sendText() {
		if (sim != null) {
			System.out.println("Enter Mobile Number");
			long mobile = scanner.nextLong();
			if (String.valueOf(mobile).length() == 10 && !sim.gettingMobileNumber().equals(mobile)) {
				System.out.println("Sending text msg to " + sim.gettingMobileNumber() + " using " + mobile);
				System.out.println("Message: Hello, this is a Text Message.");
				System.out.println("Message Sent!");
			} // if
			else {
				System.err.println("Invalid Mobile");
			} // else
		} // if
		else {
			System.err.println("No SIM Card Detected,Insert SIM Card to send a message");
		} // else
	}

	@Override
	public String displaySimCardName() {
		if (sim != null) {
			return sim.networkProvider();
		} // if
		else {
			System.err.println("No SIM Card Detected,Insert SIM Card First");
			return "";
		} // else
	}

	@Override
	public void removeSim() {
		if (sim != null) {
			System.out.print(sim.networkProvider());
			sim = null;
			System.out.println(" SIM Card Removed Successfully");
		} // if
		else {
			System.err.println("No SIM Card Detected,Insert SIM Card First");
		} // else
	}
}// class
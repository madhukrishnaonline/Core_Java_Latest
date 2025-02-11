package com.sim.impl;

import com.sim.SIM;

public class Airtel implements SIM {

	@Override
	public Long gettingMobileNumber() {
		return 9121493579l;
	}

	@Override
	public String networkProvider() {
		return "Airtel";
	}

	@Override
	public void activation() {
		System.out.println("Airtel SIM Activated");
	}

	@Override
	public void deActivation() {
		System.out.println("Airtel SIM De-Activated");
	}

}

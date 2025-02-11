package com.sim.impl;

import com.sim.SIM;

public class JIO implements SIM {

	@Override
	public Long gettingMobileNumber() {
		return 9876543210l;
	}

	@Override
	public String networkProvider() {
		return "JIO";
	}

	@Override
	public void activation() {
		System.out.println("JIO SIM Activated");
	}

	@Override
	public void deActivation() {
		System.out.println("JIO SIM De-Activated");
	}

}

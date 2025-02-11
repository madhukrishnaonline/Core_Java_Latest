package com.sim.impl;

import com.sim.SIM;

public class BSNL implements SIM {

	@Override
	public Long gettingMobileNumber() {
		return 8978888798l;
	}

	@Override
	public String networkProvider() {
		return "BSNL";
	}

	@Override
	public void activation() {
		System.out.println("BSNL SIM Activated");
	}

	@Override
	public void deActivation() {
		System.out.println("BSNL SIM De-Activated");
	}

}

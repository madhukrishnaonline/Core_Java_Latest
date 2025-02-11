package com.mobile;

import com.sim.SIM;

public interface MobilePhone {
	void insertSim(SIM sim);

	void removeSim();

	void makeCall() throws InterruptedException;

	void sendText();

	String displaySimCardName();
}

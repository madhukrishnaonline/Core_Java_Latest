package com.network.sim;

public sealed class SimCard permits Jio{
	public String s = "No Sim Card";

	public SimCard getSimName() {
		System.out.println("SimCard.getSimName()");
		return new SimCard();
	}
	
}//class
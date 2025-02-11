package com.network.sim;

public final class Jio extends SimCard {
	public String s = "Jio";
	
	@Override
	public Jio getSimName() {
		System.out.println("Jio-class");
         return new Jio();
	}
	
}//class
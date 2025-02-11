package com.mobile;

import com.network.sim.Jio;
import com.network.sim.SimCard;

public class Mobile {

	static void call(SimCard sim) {
		String s = sim.getSimName().s;
		System.out.println(s);
	}
	public static void main(String[] args) {
       call(new Jio());
	}//main
}//class
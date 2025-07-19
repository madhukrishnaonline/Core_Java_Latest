package com.object;

import java.io.Serializable;

public class Address implements Serializable {
	
	private static final long serialVersionUID = 5249188985668700491L;
	
	private final String address = "Hyderabad";

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

}

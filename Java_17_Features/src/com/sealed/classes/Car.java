package com.sealed.classes;

public final class Car implements Engine {
	
	@Override
	public String start() {
		return "Car Engine Started";
	}
}//class
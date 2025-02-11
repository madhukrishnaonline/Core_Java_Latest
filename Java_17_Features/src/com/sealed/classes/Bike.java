package com.sealed.classes;

//@ToString
public final class Bike implements Engine {
	@Override
	public String start() {
		return "Bike Engine Started";
	}
}//class
package com.cake.impl;

import com.cake.Cake;

public class OrderedCake extends Cake {

	private String message;

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
	}

	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}

	public OrderedCake() {
		super("Round", "vanilla", 1);
	}

	@Override
	public void showCake() {
		if (message != null) {
			System.out.println("A " + this.getShape() + " " + this.getFlavour() + " cake of " + this.getQty()
					+ " Kg/Kg's Ready with message " + message + " @ Rs. " + this.getPrice());
		}//if
		else {
			super.showCake();
		}//else
	}
}

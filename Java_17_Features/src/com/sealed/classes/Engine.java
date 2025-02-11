package com.sealed.classes;

public sealed interface Engine permits Car, Bike {
	String start();
}// interface
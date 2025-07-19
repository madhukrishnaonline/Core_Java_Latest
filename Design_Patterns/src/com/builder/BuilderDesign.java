package com.builder;

public class BuilderDesign {
	public static void main(String[] args) {
       Laptop laptop = new Laptop.LaptopBuilder("Lenovo","CPU").setHdd("256 HDD").build();
//      Laptop laptop = new Laptop.LaptopBuilder().build();
		System.out.println(laptop);
	}
}
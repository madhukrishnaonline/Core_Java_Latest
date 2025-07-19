package com.temp;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
class Laptop {
	private String name;
	private int hdd;
	private String cpu;
	private String ssd;

	public Laptop(LaptopBuilder builder) {
		this.name = builder.name;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		this.ssd = builder.ssd;
	}

	static class LaptopBuilder {
		private String name;
		private int hdd;
		private String cpu;
		private String ssd;

		public LaptopBuilder(String name, String cpu) {
			this.name = name;
			this.cpu = cpu;
		}

		public LaptopBuilder setHdd(int hdd) {
			this.hdd = hdd;
			return this;
		}
		public LaptopBuilder setSsd(String ssd) {
			this.ssd = ssd;
			return this;
		}

		public Laptop build() {
			return new Laptop(this);
		}
		
		

	}

}

public class Main {
	public static void main(String[] args) {
		Laptop laptop = new Laptop.LaptopBuilder("Lenovo","CPU").setHdd(256).setSsd("512 GB SSD").build();

		System.out.println(laptop);
	}
}
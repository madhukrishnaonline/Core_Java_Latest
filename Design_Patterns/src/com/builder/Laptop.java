package com.builder;

import lombok.Getter;
import lombok.ToString;

@Getter
//@Builder
@ToString//(exclude = "hdd",includeFieldNames = true)
public class Laptop {
	private String name;
	private String hdd;
	private String cpu;

	public Laptop(LaptopBuilder laptopBuilder) {
		this.name = laptopBuilder.name;
		this.hdd = laptopBuilder.hdd;
		this.cpu = laptopBuilder.cpu;
	}

	static class LaptopBuilder {
		private String name;
		private String hdd;
		private String cpu;
	
		public LaptopBuilder(String name, String cpu) {
			this.name = name;
			this.cpu = cpu;
		}
	
		public LaptopBuilder setHdd(String hdd) {
			this.hdd = hdd;
			return this;
		}
	
		public Laptop build() {
			return new Laptop(this);
		}
	}

}
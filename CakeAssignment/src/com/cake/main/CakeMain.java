package com.cake.main;

import com.cake.Cake;
import com.cake.impl.OrderedCake;

public class CakeMain {
	public static void main(String[] args) {
//        Cake cake = new OrderedCake("Round", "Vanilla", 2,"Happy Birthday");
		Cake cake=new OrderedCake();
        cake.showCake();
	}
}

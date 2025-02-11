package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample
{
	public static void main(String[] args) {
		Consumer<String> consumer = msg->System.out.println(msg);
		
		 consumer.accept("hi");
	}
}

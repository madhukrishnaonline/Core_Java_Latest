package com.arrays.stream;

import java.util.stream.Stream;

public class StreamBuilder {
	public static void main(String[] args) {
		Stream<String> stream = Stream.<String>builder().add("madhu").add("Krishna").add("kummari").build();
		stream.filter(n -> {
			if (n.contains("k") || n.contains("K"))
				return true;
			return false;
		}).forEach(System.out::println);

	}
}

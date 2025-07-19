package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FindCitiesByPopulation {

	public static void main(String[] args) {
		List<City> list = Arrays.asList(new City("Delhi", 12000l), new City("Goa", 10000l), new City("Chennai", 60000l),
				new City("Bangalore", 450000l), new City("Mumbai", 800000l), new City("Hyderabad", 1200000l));
		list.stream().collect(Collectors.groupingBy(city -> {
			if (city.getPopulation() < 100000) {
				return "Small";
			} else if (city.getPopulation() > 100000 && city.getPopulation() < 1000000) {
				return "Medium";
			} else {
				return "Large";
			}
		}, Collectors.mapping(cities -> cities.getName(), Collectors.toList())))
				.forEach((k, v) -> System.out.println(k + "=" + v));
	}
}
@Data
@AllArgsConstructor
class City {
	private String name;
	private Long population;
}
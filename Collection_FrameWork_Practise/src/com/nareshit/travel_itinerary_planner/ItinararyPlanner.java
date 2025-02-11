package com.nareshit.travel_itinerary_planner;

import java.util.List;

public class ItinararyPlanner {
	private List<Destination> destinations;

	public ItinararyPlanner(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public void addDestination(Destination dest) {
		destinations.add(dest);
	}
	
	public List<Destination> displayAllDestinations(){
		return destinations;
	}
}

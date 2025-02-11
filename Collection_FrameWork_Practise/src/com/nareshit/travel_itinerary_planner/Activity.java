package com.nareshit.travel_itinerary_planner;

public class Activity {
	private String name;
	private String schedule;

	public Activity() {
	}

	public Activity(String name, String schedule) {
		this.name = name;
		this.schedule = schedule;
	}

	public String getName() {
		return name;
	}

	public String getSchedule() {
		return schedule;
	}

	@Override
	public String toString() {
		return "-" + name + "(" + schedule + ")";
	}

}

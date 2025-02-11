package com.nareshit.travel_itinerary_planner;

import java.util.ArrayList;
import java.util.List;

public class Destination {
	private String destination;
	private List<Activity> activities;

	public Destination(String destination) {
		this.destination = destination;
		this.activities = new ArrayList<>();
	}

	public void addActivity(Activity activity) {
		activities.add(activity);
	}

	public List<Activity> displayActivities() {
		return activities;
	}

	@Override
	public String toString() {
		return "destination:" + destination;
	}

}

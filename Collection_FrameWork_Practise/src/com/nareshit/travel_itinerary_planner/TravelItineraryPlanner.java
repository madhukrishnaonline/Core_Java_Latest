package com.nareshit.travel_itinerary_planner;

import java.util.ArrayList;
import java.util.List;

public class TravelItineraryPlanner {
	public static void main(String[] args) {
        
        Destination destination1 = new Destination("Paris");
        Destination destination2 = new Destination("London");
        
        Activity activity1 = new Activity("Visit Eiffel Tower","Morining");
        Activity activity2 = new Activity("Louvre Museum","Afternoon");
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        
        Activity activity3 = new Activity("British Museum","Morning");
        Activity activity4 = new Activity("London Eye","Afternoon");
        destination2.addActivity(activity3);
        destination2.addActivity(activity4);
        
        List<Destination> list = new ArrayList<>();
        ItinararyPlanner planner = new ItinararyPlanner(list);
        
        planner.addDestination(destination1);
        planner.addDestination(destination2);
        
        List<Destination> destinations = planner.displayAllDestinations();
        for(Destination destination:destinations) {
        	System.out.println(destination);
        	List<Activity> activities = destination.displayActivities();
        	for(Activity activity:activities) {
        		System.out.println("\t"+activity);
        	}
        }
	}
}

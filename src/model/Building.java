package model;

import java.util.ArrayList;
import java.util.List;

import dispatcher.ExternalButtonDispatcher;

public class Building {
	
	private final List<Floor> floors = new ArrayList<Floor>();
	
	

	
	public Building(int n, ExternalButtonDispatcher dispatcher) {
		
		for(int i =0; i< n ; i++) {
			floors.add(new Floor(i, dispatcher));
			
		}
		
	}
	
	public Floor getFloor(int floor) {
		if(floor > floors.size()) {
			throw  new IllegalArgumentException("this floor is not working ");
		}
		return floors.get(floor - 1);
	}
	
	

}

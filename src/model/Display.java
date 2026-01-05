package model;

import enums.ElevatorDirection;

public class Display {
	
	public void display(int elevId, int floorNo, ElevatorDirection direction) {
		System.out.println("Elevator "+ elevId + 
				             "Floor Number " + floorNo + 
				             "in diretion" + direction); 
	}

}

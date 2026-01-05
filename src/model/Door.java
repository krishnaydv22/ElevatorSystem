package model;

import enums.DoorStatus;

public class Door {
	
	private DoorStatus doorStatus = DoorStatus.CLOSE;
	
	public void open(int eleId) {
		
		doorStatus = DoorStatus.OPEN;
		
		System.out.println("Door is open for Elevator " + eleId);
		
		
	}
	
	public void close(int eleId) {
		
		doorStatus = DoorStatus.CLOSE;
		
		System.out.println("Door is closed for Elevator " + eleId);
		
		
	}

}

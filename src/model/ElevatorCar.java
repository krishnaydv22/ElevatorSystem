package model;

import enums.ElevatorDirection;

public class ElevatorCar {
	
	private int elevatorId;
	
	private int currrentFloor;
	
	private ElevatorDirection elevatorDirection;
	
	private Door door;
	
	private Display display;
	
	public ElevatorCar(int id) {
        this.elevatorId = id;
        this.currrentFloor = 0;
        elevatorDirection = ElevatorDirection.IDLE;
        
        display = new Display();
        door = new Door();
        
	}
	
	public void move(int destination) {
		
		
		if(this.currrentFloor == destination) {
			door.open(elevatorId);
			return;
			
			}
		door.close(elevatorId);
		
		if(destination > currrentFloor) {
			elevatorDirection = ElevatorDirection.UP;
			
			for(int i =currrentFloor + 1; i <= destination; i++) {
				sleep();
				currrentFloor = i;
				display.display(elevatorId, currrentFloor, elevatorDirection);
			}
			
		}else {
			
			elevatorDirection = ElevatorDirection.DOWN;
			for(int i = currrentFloor - 1; i >= destination; i--) {
				sleep();
				currrentFloor = i;
				display.display(elevatorId, currrentFloor, elevatorDirection);
			}
			
			
		}
		
		door.open(elevatorId);
		elevatorDirection = ElevatorDirection.IDLE;
		

		
		
	}
	
	public int getElevatorId() {
		return elevatorId;
	}

	public void setElevatorId(int elevatorId) {
		this.elevatorId = elevatorId;
	}

	public int getCurrrentFloor() {
		return currrentFloor;
	}

	public void setCurrrentFloor(int currrentFloor) {
		this.currrentFloor = currrentFloor;
	}

	public ElevatorDirection getElevatorDirection() {
		return elevatorDirection;
	}

	public void setElevatorDirection(ElevatorDirection elevatorDirection) {
		this.elevatorDirection = elevatorDirection;
	}

	
	public void sleep() {
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
	}

}

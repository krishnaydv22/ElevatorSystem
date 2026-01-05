package model;

import button.ExternalButton;
import dispatcher.ExternalButtonDispatcher;
import enums.ElevatorDirection;

public class Floor {
	
	private int id;
	
	private ExternalButton upword;
	private ExternalButton downword;
	
	public Floor(int id, ExternalButtonDispatcher dispatcher) {
		upword = new ExternalButton(dispatcher);
		downword = new ExternalButton(dispatcher);
		
	}
	
	
	public void pressUp() {
		upword.preesButton(id, ElevatorDirection.UP);
		
	}
	
	public void downUp() {
		upword.preesButton(id, ElevatorDirection.DOWN);
		
	}

}

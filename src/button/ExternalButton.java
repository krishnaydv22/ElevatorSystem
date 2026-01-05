package button;

import dispatcher.ExternalButtonDispatcher;
import enums.ElevatorDirection;

public class ExternalButton {
	
	private final ExternalButtonDispatcher dispatcher;
	
	
	public ExternalButton( ExternalButtonDispatcher dispatcher) {
		this.dispatcher =dispatcher;
	}
	
	
	public void preesButton(int floorNo, ElevatorDirection direction) {
	  dispatcher.submitExternalRequest(floorNo, direction);
	}
	
	
	

}

package button;

import controllers.ElevatorController;
import dispatcher.InternalDispatcher;

public class InternalButton {
	
	private final ElevatorController controller;
	
	public InternalButton(ElevatorController controller) {
		this.controller = controller;
	}
	
	
	public void submitRequest(int floor) {
		InternalDispatcher.getInternalDispInstnace().submitInternalRequest(floor, controller);
	}

}

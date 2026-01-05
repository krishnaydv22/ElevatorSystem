package dispatcher;

import controllers.ElevatorController;

public class InternalDispatcher {
	
	public static final InternalDispatcher instance = new InternalDispatcher();
	
	private InternalDispatcher() {};
	
	public static InternalDispatcher getInternalDispInstnace() {
		return instance;
	}
	
	
	
	public void submitInternalRequest(int floor, ElevatorController controller) {
		controller.addRequest(floor);
		
	}
}

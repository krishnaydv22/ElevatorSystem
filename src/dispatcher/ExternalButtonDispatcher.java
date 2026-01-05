package dispatcher;

import controllers.ElevatorController;
import controllers.ScheduleController;
import enums.ElevatorDirection;

public class ExternalButtonDispatcher {
	
	private final ScheduleController schedulerController;
	
	public ExternalButtonDispatcher(ScheduleController scheduleController) {
		this.schedulerController = scheduleController;
	}
	
	public void submitExternalRequest(int floorNo, ElevatorDirection direction) {
		
		ElevatorController controller =  schedulerController.assignElevator(floorNo, direction);
		controller.addRequest(floorNo);
	}
	
}

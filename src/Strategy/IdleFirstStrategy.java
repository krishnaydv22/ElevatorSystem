package Strategy;

import java.util.List;

import controllers.ElevatorController;
import enums.ElevatorDirection;

public class IdleFirstStrategy implements ElevatorSelectionStrategy{

	@Override
	public ElevatorController selectElevator(List<ElevatorController> controllers, int floorNo,
			ElevatorDirection direction) {
		
		  for (ElevatorController e : controllers) {
	            if (e.getElevator().getElevatorDirection() == ElevatorDirection.IDLE) {
	                return e;
	            }
	        }
	        return controllers.get(0);
		
		
		
	}

}

package Strategy;

import java.util.List;

import controllers.ElevatorController;
import enums.ElevatorDirection;

public class DirectionAwareStrategy implements ElevatorSelectionStrategy{

	@Override
	public ElevatorController selectElevator(List<ElevatorController> controllers, int floorNo,
			ElevatorDirection direction) {
		
		for(ElevatorController e : controllers) {
			
			if(e.getElevator().getElevatorDirection() == ElevatorDirection.UP && e.getElevator().getCurrrentFloor()<= floorNo) {
				return e;
			}
			if(e.getElevator().getElevatorDirection() == ElevatorDirection.DOWN && e.getElevator().getCurrrentFloor() >=  floorNo) {
				return e;
			}
			
			
			
		}
		
		return controllers.get(0);

	
	}
	
	

}

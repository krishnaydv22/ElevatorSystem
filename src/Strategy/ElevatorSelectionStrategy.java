package Strategy;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import controllers.ElevatorController;
import enums.ElevatorDirection;

public interface ElevatorSelectionStrategy {
	
	public ElevatorController selectElevator(List<ElevatorController> controllers, int floorNo, ElevatorDirection direction);
	
	

}

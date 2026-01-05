package Strategy;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import controllers.ElevatorController;
import enums.ElevatorDirection;

public class NearestElevatorStrategy implements ElevatorSelectionStrategy{

	@Override
	public ElevatorController selectElevator(List<ElevatorController> controllers, int floorNo, ElevatorDirection direction) {
		
		ElevatorController best = null;
		
		int min = Integer.MAX_VALUE;
		
		for(ElevatorController c : controllers) {
			
			int diff = Math.abs(c.getElevator().getCurrrentFloor() - floorNo );
			
			if(diff < min) {
				min = diff;
				best = c;
			}
			
		}
		
		if(best == null) {
			return controllers.get(0);
		}
		
		return best;
	}

}

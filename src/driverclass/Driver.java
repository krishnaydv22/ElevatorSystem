package driverclass;

import java.util.Arrays;

import Strategy.NearestElevatorStrategy;
import button.InternalButton;
import controllers.ElevatorController;
import controllers.ScheduleController;
import dispatcher.ExternalButtonDispatcher;
import model.Building;
import model.ElevatorCar;

public class Driver {
	public static void main(String[] args) {
		
		ElevatorCar elevatorCar1 = new ElevatorCar(1);
		ElevatorController elevController1 = new ElevatorController(elevatorCar1);
		ElevatorCar elevatorCar2 = new ElevatorCar(2);
		ElevatorController elevController2 = new ElevatorController(elevatorCar2);
		
          ScheduleController scheduler = new ScheduleController( new NearestElevatorStrategy(), Arrays.asList(elevController1, elevController2));

          ExternalButtonDispatcher externaldispatcher = new ExternalButtonDispatcher(scheduler);
          
          InternalButton internalButton_for_elevator1 = new InternalButton(elevController1);
          InternalButton internalButton_for_elevator2 = new InternalButton(elevController1);



          
          Building building = new Building(5, externaldispatcher);
          
          new Thread(elevController1, "Elevator-1").start();
          new Thread(elevController2, "Elevator-2").start();
          
          building.getFloor(3).pressUp();
         
          building.getFloor(5).downUp();
          
          
          
          internalButton_for_elevator1.submitRequest(4);
          
          
       


          
          
          



          
          
          
          
		
	}

}

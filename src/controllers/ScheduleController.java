package controllers;

import java.util.List;

import Strategy.ElevatorSelectionStrategy;
import enums.ElevatorDirection;


public class ScheduleController {
	
	private  ElevatorSelectionStrategy strategy;
	
	private final List<ElevatorController> controllers;
	
	public ScheduleController(ElevatorSelectionStrategy strategy, List<ElevatorController> controllers) {
		this.strategy = strategy;
		this.controllers = controllers;
	}
	
	
	public ElevatorController assignElevator(int floorNo, ElevatorDirection direction) {
		
		return strategy.selectElevator(controllers, floorNo, direction);
		
	}
	
	public void setStrategy(ElevatorSelectionStrategy strategy) {
        this.strategy = strategy;
    }
	
	
	
	
	

}

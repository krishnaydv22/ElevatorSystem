package controllers;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

import model.ElevatorCar;

public class ElevatorController implements Runnable{
	
	private final ElevatorCar elevatorCar;
	
	private final PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	private final PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

	
	
	public ElevatorController(ElevatorCar elevatorCar) {
		
		this.elevatorCar = elevatorCar;
		
	}
	
	public ElevatorCar getElevator() {
		return this.elevatorCar;
	}
	
	private static Object monitor = new Object();
	
	
	public void addRequest(int floorNo) {
		
		synchronized (monitor) {
			if(minHeap.isEmpty() ||   floorNo > minHeap.peek() ) {
				minHeap.add(floorNo);
			}else {
				maxHeap.add(floorNo);
			}
			
			monitor.notify();
			
		}
		
	}
	
	public void run() {
		
		while(true) {
			
			synchronized (monitor) {
				
				while(!minHeap.isEmpty() && maxHeap.isEmpty()) {
					try {
						monitor.wait();
					}catch(InterruptedException e) {}
				}
				
				
			}
			
			while(!minHeap.isEmpty()) {
				elevatorCar.move(minHeap.poll());
			}
			
			while(!maxHeap.isEmpty()) {
				elevatorCar.move(maxHeap.poll());
			}
		}
	}

}

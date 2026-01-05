## External Request(person on floor)
Floor Button Press <br>
   ↓<br>
ExternalButton<br>
   ↓<br>
ExternalDispatcher<br>
   ↓<br>
ElevatorScheduler<br>
   ↓<br>
ElevatorSelectionStrategy (Factory)<br>
   ↓<br>
ElevatorController<br>
   ↓<br>
SCAN Algorithm (MinHeap / MaxHeap)<br>
   ↓<br>
ElevatorCar<br>
   ↓<br>
Display + Door<br>

## Internal Request(Person inside Elevator)<br>
Person <br>
 ↓<br>
InternalButton<br>
 ↓<br>
InternalDispatcher (Singleton)<br>
 ↓<br>
ElevatorController<br>
 ↓<br>
ElevatorCar.moveElevator()



<img width="1447" height="746" alt="image" src="https://github.com/user-attachments/assets/3a331941-04b0-4487-af02-1287d4ca2539" />

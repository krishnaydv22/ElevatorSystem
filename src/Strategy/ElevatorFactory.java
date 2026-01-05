package Strategy;

import java.util.HashMap;
import java.util.Map;

public class ElevatorFactory {
	private static final Map<String, ElevatorSelectionStrategy> map = new HashMap<String, ElevatorSelectionStrategy>();

	static {
		map.put("nearest", new NearestElevatorStrategy());
		map.put("idlefirst", new IdleFirstStrategy());
		map.put("directionaware",new DirectionAwareStrategy());
		
		
	}
	

	
	public static ElevatorSelectionStrategy getStrategy(String type) {
		
		return map.getOrDefault(type, new NearestElevatorStrategy());
		
		
	   }

}

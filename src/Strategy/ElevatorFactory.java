package Strategy;

import java.util.HashMap;
import java.util.Map;

public class ElevatorFactory {
	private static final Map<String, ElevatorSelectionStrategy> map = new HashMap<String, ElevatorSelectionStrategy>();

	static {
		map.put("nearest", new NearestElevatorStrategy());
		
	}
	

	
	public static ElevatorSelectionStrategy getStrategy() {
		
		return map.getOrDefault("nearest", new NearestElevatorStrategy());
		
		
	   }

}

import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries"
	// if the key "salad" has a value, set that as the value for the key "spinach"
	public Map<String, String> topping3(Map<String, String> map) {
		
		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));
		}
		
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("potato", "ketchup");
		System.out.println(o.topping3(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("potato", "butter");
		System.out.println(o.topping3(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("salad", "oil");
		m3.put("potato", "ketchup");
		System.out.println(o.topping3(m3));

	}

}

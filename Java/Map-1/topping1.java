import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry"
	// in all cases, set the key "bread" to have the value "butter"
	public Map<String, String> topping1(Map<String, String> map) {
		
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
			
		}
		map.put("bread", "butter");
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("ice cream", "peanuts");
		System.out.println(o.topping1(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		System.out.println(o.topping1(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("pancake", "syrup");
		System.out.println(o.topping1(m3));

	}

}

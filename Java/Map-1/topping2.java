import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also
	// if the key "spinach" has a value, change that value to "nuts"
	public Map<String, String> topping2(Map<String, String> map) {
		
		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));
		}
		
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("ice cream", "cherry");
		System.out.println(o.topping2(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("spinach", "dirt");
		m2.put("ice cream", "cherry");
		System.out.println(o.topping2(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("yogurt", "salt");
		System.out.println(o.topping2(m3));

	}

}

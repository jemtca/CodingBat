import java.util.Map;
import java.util.HashMap;

public class map1 {
	
    // modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value ""
    // basically "b" is a bully, taking the value and replacing it with the empty string
	public Map<String, String> mapBully(Map<String, String> map) {
		
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "candy");
		m1.put("b", "dirt");
		System.out.println(o.mapBully(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("a", "candy");
		System.out.println(o.mapBully(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("a", "candy");
		m3.put("b", "dirt");
		m3.put("c", "meh");
		System.out.println(o.mapBully(m3));

	}

}

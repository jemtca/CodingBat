import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map
	public Map<String, String> mapAB3(Map<String, String> map) {
		
		if (map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		}
		else if (!map.containsKey("a") && map.containsKey("b")) {
			map.put("a", map.get("b"));
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "aaa");
		m1.put("c", "cake");
		System.out.println(o.mapAB3(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("b", "bbb");
		m2.put("c", "cake");
		System.out.println(o.mapAB3(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("a", "aaa");
		m3.put("b", "bbb");
		m3.put("c", "cake");
		System.out.println(o.mapAB3(m3));

	}

}

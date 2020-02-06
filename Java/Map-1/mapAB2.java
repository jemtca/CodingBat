import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both
	public Map<String, String> mapAB2(Map<String, String> map) {
		
		if (map.containsKey("a") && map.containsKey("b") && (map.get("a") == map.get("b"))) {
			System.out.println("a: " + map.get("a"));
			System.out.println("b: " + map.get("b"));
			map.remove("a");
			map.remove("b");
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "aaa");
		m1.put("b", "aaa");
		m1.put("c", "cake");
		System.out.println(o.mapAB2(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("a", "aaa");
		m2.put("b", "bbb");
		System.out.println(o.mapAB2(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("a", "aaa");
		m3.put("b", "bbb");
		m3.put("c", "aaa");
		System.out.println(o.mapAB2(m3));

	}

}

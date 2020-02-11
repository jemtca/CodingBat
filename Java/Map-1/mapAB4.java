import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value
	// if the values exist and have the same length, change them both to the empty string in the map
	public Map<String, String> mapAB4(Map<String, String> map) {
		
		if (map.containsKey("a") && map.containsKey("b")) {
			if (map.get("a").length() > map.get("b").length()) {
				map.put("c", map.get("a"));
			}
			else if (map.get("a").length() < map.get("b").length()) {
				map.put("c", map.get("b"));
			}
			else {
				map.put("a", "");
				map.put("b", "");
			}
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "aaa");
		m1.put("b", "bb");
		m1.put("c", "cake");
		System.out.println(o.mapAB4(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("a", "aa");
		m2.put("b", "bbb");
		m2.put("c", "cake");
		System.out.println(o.mapAB4(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("a", "aa");
		m3.put("b", "bbb");
		System.out.println(o.mapAB4(m3));

	}

}

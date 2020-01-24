import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value
	// in all cases remove the key "c", leaving the rest of the map unchanged
	public Map<String, String> mapBully(Map<String, String> map) {
		
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		map.remove("c");
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "aaa");
		m1.put("b", "bbb");
		m1.put("c", "ccc");
		System.out.println(o.mapBully(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("b", "xyz");
		m2.put("c", "ccc");
		System.out.println(o.mapBully(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("a", "aaa");
		m3.put("c", "meh");
		m3.put("d", "hi");
		System.out.println(o.mapBully(m3));

	}

}

import java.util.Map;
import java.util.HashMap;

public class map1 {
	
	// modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys
	// if both keys are present, append their 2 string values together and store the result under the key "ab"
	public Map<String, String> mapAB(Map<String, String> map) {
		
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		
		return map;
		
	}

	public static void main(String[] args) {

		map1 o = new map1();
		
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "Hi");
		m1.put("b", "There");
		System.out.println(o.mapAB(m1));
		
		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("a", "Hi");
		System.out.println(o.mapAB(m2));
		
		Map<String, String> m3 = new HashMap<String, String>();
		m3.put("b", "There");
		System.out.println(o.mapAB(m3));

	}

}

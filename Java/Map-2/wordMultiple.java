import java.util.HashMap;
import java.util.Map;

public class map2 {

	// given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array
	public Map<String, Boolean> wordMultiple(String[] str) {
		
		Map<String, Boolean> map = new HashMap<String, Boolean>();

		for (int i =0; i < str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], false);
			}
			else {
				map.put(str[i], true);
			}
		}

		return map;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"a", "b", "a", "c", "b"};
		String[] s2 = {"c", "b", "a"};
		String[] s3 = {"c", "c", "c", "c"};
		
		System.out.println(o.wordMultiple(s1));
		System.out.println(o.wordMultiple(s2));
		System.out.println(o.wordMultiple(s3));
		

	}

}

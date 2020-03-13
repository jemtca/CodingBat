import java.util.HashMap;
import java.util.Map;

public class map2 {

	// given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen
	// with the value of all the strings starting with that character appended together in the order they appear in the array
	public Map<String, String> firstChar(String[] str) {
		
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(String.valueOf(str[i].charAt(0)))) {
				map.put(String.valueOf(str[i].charAt(0)), str[i]);
			}
			else {
				String stringAppended = map.get(String.valueOf(str[i].charAt(0))) + str[i];
				map.put(String.valueOf(str[i].charAt(0)), stringAppended);
			}
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"salt", "tea", "soda", "toast"};
		String[] s2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
		String[] s3 = {};
		
		System.out.println(o.firstChar(s1));
		System.out.println(o.firstChar(s2));
		System.out.println(o.firstChar(s3));
		

	}

}

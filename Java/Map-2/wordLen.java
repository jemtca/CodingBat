import java.util.HashMap;
import java.util.Map;

public class map2 {

	// given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length
	public Map<String, Integer> wordLen(String[] str) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < str.length; i++) {
			map.put(str[i], str[i].length());
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"a", "bb", "a", "bb"};
		String[] s2 = {"this", "and", "that", "and"};
		String[] s3 = {"code", "code", "code", "bug"};
		
		System.out.println(o.wordLen(s1));
		System.out.println(o.wordLen(s2));
		System.out.println(o.wordLen(s3));
		

	}

}

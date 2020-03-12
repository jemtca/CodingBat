import java.util.HashMap;
import java.util.Map;

public class map2 {

	// the classic word-count algorithm: given an array of strings
	// return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array
	public Map<String, Integer> wordCount(String[] str) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < str.length; i ++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], 1);
			}
			else {
				int value = map.get(str[i]);
				map.put(str[i], ++value);
			}
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"a", "b", "a", "c", "b"};
		String[] s2 = {"c", "b", "a"};
		String[] s3 = {"c", "c", "c", "c"};
		
		System.out.println(o.wordCount(s1));
		System.out.println(o.wordCount(s2));
		System.out.println(o.wordCount(s3));
		

	}

}

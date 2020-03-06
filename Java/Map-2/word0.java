import java.util.HashMap;
import java.util.Map;

public class map2 {

	// given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0
	public Map<String, Integer> word0(String[] str) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], 0);
			}
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"a", "b", "a", "b"};
		String[] s2 = {"a", "b", "a", "c", "b"};
		String[] s3 = {"c", "b", "a"};
		
		System.out.println(o.word0(s1));
		System.out.println(o.word0(s2));
		System.out.println(o.word0(s3));
		

	}

}

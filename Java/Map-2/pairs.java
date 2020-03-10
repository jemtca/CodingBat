import java.util.HashMap;
import java.util.Map;

public class map2 {

	// given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value
	public Map<String, String> pairs(String[] str) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < str.length; i++) {
			map.put(String.valueOf(str[i].charAt(0)), String.valueOf(str[i].charAt(str[i].length()-1)));	
		}
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"code", "bug"};
		String[] s2 = {"man", "moon", "main"};
		String[] s3 = {"man", "moon", "good", "night"};
		
		System.out.println(o.pairs(s1));
		System.out.println(o.pairs(s2));
		System.out.println(o.pairs(s3));
		

	}

}

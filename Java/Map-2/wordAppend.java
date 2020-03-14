import java.util.HashMap;
import java.util.Map;

public class map2 {

	// loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array append the string to the result
	// return the empty string if no string appears a 2nd time
	public String firstChar(String[] str) {
		
		String s = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		
		for (int i = 0; i < str.length; i++) {
			if (!map.containsKey(str[i])) {
				map.put(str[i], 1);
			} 
			else {
				int oneAdded = map.get(str[i]) + 1;
				map.put(str[i], oneAdded);	
			}
			
			if (map.get(str[i]) > 1 && map.get(str[i]) % 2 == 0) {
				s = s + str[i];
			}
			
		}

		return s;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"a", "b", "a"};
		String[] s2 = {"a", "b", "a", "c", "a", "d", "a"};
		String[] s3 = {"a", "", "a"};
		
		System.out.println(o.firstChar(s1));
		System.out.println(o.firstChar(s2));
		System.out.println(o.firstChar(s3));
		

	}

}

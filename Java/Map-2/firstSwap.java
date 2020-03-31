import java.util.HashMap;
import java.util.Map;

public class map2 {

	// we'll say that 2 strings "match" if they are non-empty and their first chars are the same
	// loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array
	// a particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled
	// using a map, this can be solved making just one pass over the array
	public String[] firstSwap(String[] str) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<Character, Character> mapFirstChar = new HashMap<Character, Character>();
		
		for (int i = 0; i < str.length; i++) {
			if (!mapFirstChar.containsKey(str[i].charAt(0))) {
				if (!map.containsKey(String.valueOf(str[i].charAt(0)))) {
					map.put(String.valueOf(str[i].charAt(0)), i);
				}
				else {
					int index = map.get(String.valueOf(str[i].charAt(0)));
					String value = str[i];
					str[i] = str[index];
					str[index] = value;
					map.remove(String.valueOf(str[i].charAt(0)));
					mapFirstChar.put(str[i].charAt(0), str[i].charAt(0));
				}
			}
		}
	
		return str;
		
	}
	
	public static void main(String[] args) {
		
		map2 o = new map2();
		
		String[] s1 = {"ab", "ac"};
		String[] s2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
		String[] s3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
		
		String[] x = o.firstSwap(s1);
		System.out.println("[\"" + x[0] + "\", \"" + x[1] + "\"]");
		
		String[] y = o.firstSwap(s2);
		System.out.println("[\"" + y[0] + "\", \"" + y[1] + "\", \"" + y[2] + "\", \"" + y[3] + "\", \"" + y[4] + 
				"\", \"" + y[5] + "\", \"" + y[6] + "\", \"" + y[7] + "\"]");
		
		String[] z = o.firstSwap(s3);
		System.out.println("[\"" + z[0] + "\", \"" + z[1] + "\", \"" + z[2] + "\", \"" + z[3] + "\", \"" + z[4] + 
				"\", \"" + z[5] + "\", \"" + z[6] + "\", \"" + z[7] + "\"]");
		
	}

}

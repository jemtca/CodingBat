
public class recursion1 {
	
	// given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap
	public int count11(String str) {
		
		if (str.isEmpty()) {
			return 0;
		}
		
		if (str.length() > 2 && str.charAt(0) == '1' && str.charAt(1) == '1' && str.charAt(2) == '1') {
			return 1 + count11(str.substring(2));
		}
		else if (str.length() > 2 && str.charAt(0) == '1' && str.charAt(1) == '1' && str.charAt(2) != '1') {
			return 1 + count11(str.substring(3));
		}
		else if (str.length() == 2 && str.charAt(0) == '1' && str.charAt(1) == '1') {
			return 1 + count11(str.substring(2));
		}
		else {
			return count11(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.count11("11abc11"));
		System.out.println(o.count11("abc11x11x11"));
		System.out.println(o.count11("111"));
		
	}

}


public class recursion1 {
	
	// given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*"
	public String pairStar(String str) {
	
		String s = "";
				
		if (str.isEmpty()) {
			return s;
		}
		if (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
			return s + str.charAt(0) + "*" + pairStar(str.substring(1));
		}
		else {
			return s + str.charAt(0) + pairStar(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.pairStar("hello"));
		System.out.println(o.pairStar("xxyy"));
		System.out.println(o.pairStar("aaaa"));

	}

}

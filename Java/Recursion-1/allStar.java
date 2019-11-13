
public class recursion1 {
	
	// given a string, compute recursively a new string where all the adjacent chars are now separated by a "*"
	public String allStar(String str) {
		
		if (str.isEmpty()) {
			return "";
		}
		
		if (str.length() > 1) {
			return str.charAt(0) + "*" + allStar(str.substring(1));
		}
		else {
			return str.charAt(0) + allStar(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.allStar("hello"));
		System.out.println(o.allStar("abc"));
		System.out.println(o.allStar("ab"));
		
	}

}

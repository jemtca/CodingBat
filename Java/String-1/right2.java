
public class string1 {
	
	// given a string, return a "rotated right 2" version where the last 2 chars are moved to the start
	// the string length will be at least 2
	public String right2(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring(str.length()-2) + str.substring(0, str.length()-2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.right2("Hello"));
		System.out.println(o.right2("java"));
		System.out.println(o.right2("Hi"));
	
	}

}

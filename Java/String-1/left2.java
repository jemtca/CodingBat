
public class string1 {
	
	// given a string, return a "rotated left 2" version where the first 2 chars are moved to the end
	// the string length will be at least 2
	public String left2(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring(2) + str.substring(0, 2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.left2("Hello"));
		System.out.println(o.left2("java"));
		System.out.println(o.left2("Hi"));
	
	}

}

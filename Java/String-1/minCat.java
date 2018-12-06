
public class string1 {
	
	// given two strings, append them together (known as "concatenation") and return the result
	// however, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string
	// so "Hello" and "Hi" yield "loHi"
	// the strings may be any length
	public String minCat(String a, String b) {
		
		String s = "";
		
		if (a.length() == b.length())
			s = a + b;
		else if (a.length() > b.length())
			s = a.substring(a.length() - b.length()) + b;
		else if (b.length() > a.length())
			s = a + b.substring(b.length()-a.length());
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.minCat("Hello", "Hi"));
		System.out.println(o.minCat("Hello", "java"));
		System.out.println(o.minCat("java", "Hello"));
	
	}

}

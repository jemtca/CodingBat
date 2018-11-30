
public class string1 {
	
	// given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside
	// the strings will not be the same length, but they may be empty
	public String comboString(String a, String b) {
		
		String s = "";
		
		if (a.isEmpty())
			s = b;
		else if (b.isEmpty())
			s = a;
		else
			if (a.length() < b.length())
				s = a + b + a;
			else
				s = b + a + b;
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.comboString("Hello", "hi"));
		System.out.println(o.comboString("hi", "Hello"));
		System.out.println(o.comboString("aaa", "b"));
	
	}

}

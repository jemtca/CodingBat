
public class string1 {
	
	// given two strings, append them together (known as "concatenation") and return the result
	// however, if the concatenation creates a double-char, then omit one of the chars
	public String conCat(String a, String b) {
		
		String s = "";
		
		if (a.isEmpty() && !b.isEmpty())
			s = b;
		if (!a.isEmpty() && b.isEmpty())
			s = a;
		if (!a.isEmpty() && !b.isEmpty()) {
			if (a.charAt(a.length()-1) == b.charAt(0))
				s = a.substring(0, a.length()-1) + b;
			else
				s = a + b;
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.conCat("abc", "cat"));
		System.out.println(o.conCat("dog", "cat"));
		System.out.println(o.conCat("abc", ""));
	
	}

}

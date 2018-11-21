
public class string1 {
	
	// given 2 strings, a and b, return a new string made of the first char of a and the last char of b
	// if either string is length 0, use '@' for its missing char
	public String lastChars(String a, String b) {
		
		String s = "";
		
		if (a.isEmpty() && b.isEmpty())
			s = "@@";
		else if (a.isEmpty())
			s = "@" + b.charAt(b.length()-1);
		else if (b.isEmpty())
			s = a.charAt(0) + "@";
		else
			s = String.valueOf(a.charAt(0)) + Character.toString(b.charAt(b.length()-1));
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.lastChars("last", "chars"));
		System.out.println(o.lastChars("yo", "java"));
		System.out.println(o.lastChars("hi", ""));

	}

}

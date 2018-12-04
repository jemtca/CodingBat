
public class string1 {
	
	// given a string, return a string length 2 made of its first 2 chars
	// if the string length is less than 2, use '@' for the missing chars
	public String atFirst(String str) {
		
		String s = "@@";
		
		if (str.length() == 1)
			s = str.charAt(0) + "@";
		else if (str.length() >= 2)
			s = str.substring(0, 2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.atFirst("hello"));
		System.out.println(o.atFirst("hi"));
		System.out.println(o.atFirst("h"));
	
	}

}

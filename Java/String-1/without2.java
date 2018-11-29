
public class string1 {
	
	// given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning
	// so "HelloHe" yields "lloHe"
	// the substring may overlap with itself, so "Hi" yields ""
	// otherwise, return the original string unchanged
	public String without2(String str) {
		
		String s;
		
		if (str.length() == 2)
			s = "";
		else if (str.length() > 2 && str.substring(0, 2).equals(str.substring(str.length()-2)))
			s = str.substring(2);
		else
			s = str;
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.without2("HelloHe"));
		System.out.println(o.without2("HelloHi"));
		System.out.println(o.without2("Hi"));
	
	}

}

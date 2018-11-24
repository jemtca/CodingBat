
public class string1 {
	
	// given a string, return a version without the first and last char
	// the string length will be at least 2
	public String withoutEnd(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring(1, str.length()-1);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.withoutEnd("Hello"));
		System.out.println(o.withoutEnd("java"));
		System.out.println(o.withoutEnd("coding"));
	
	}

}

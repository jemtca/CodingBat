
public class string1 {
	
	// given a string, return a version without both the first and last char of the string
	// the string may be any length, including 0
	public String withoutEnd2(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring(1, str.length()-1);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.withoutEnd2("Hello"));
		System.out.println(o.withoutEnd2("abc"));
		System.out.println(o.withoutEnd2("ab"));
	
	}

}

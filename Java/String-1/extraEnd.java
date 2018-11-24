
public class string1 {
	
	// given a string, return a new string made of 3 copies of the last 2 chars of the original string
	// the string length will be at least 2
	public String extraEnd(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.extraEnd("Hello"));
		System.out.println(o.extraEnd("ab"));
		System.out.println(o.extraEnd("Hi"));
	
	}

}

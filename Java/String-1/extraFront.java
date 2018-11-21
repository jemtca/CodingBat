
public class string1 {
	
	// given a string, return a new string made of 3 copies of the first 2 chars of the original string
	// the string may be any length
	// if there are fewer than 2 chars, use whatever is there
	public String extraFront(String str) {
		
		String s = "";
		
		if (str.length() < 2)
			s = str + str + str;
		else
			s = str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.extraFront("Hello"));
		System.out.println(o.extraFront("ab"));
		System.out.println(o.extraFront("H"));
		
	}

}

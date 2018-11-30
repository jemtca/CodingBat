
public class string1 {
	
	// given a string, return the string made of its first two chars
	// if the string is shorter than length 2, return whatever there is 
	public String firstTwo(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring(0, 2);
		else
			s = str;
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.firstTwo("Hello"));
		System.out.println(o.firstTwo("abcdefg"));
		System.out.println(o.firstTwo("ab"));
	
	}

}

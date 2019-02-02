
public class string2 {
	
	// given a string, return a string where for every char in the original, there are two chars
	public String doubleChar(String str) {
		
		String s = "";
		
		for (int i = 0; i < str.length(); i++) {
			s = s + str.charAt(i) + str.charAt(i);
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.doubleChar("The"));
		System.out.println(o.doubleChar("AAbb"));
		System.out.println(o.doubleChar("Hi-There"));

	}

}

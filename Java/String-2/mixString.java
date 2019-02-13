
public class string2 {
	
	// given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on
	// any leftover chars go at the end of the result
	public String mixString(String a, String b) {
		
		String s = "";
		int lengthA = a.length();
		int lengthB = b.length();
		
		if (lengthA > lengthB) {
			for (int i = 0; i < b.length(); i++) {
				s = s + a.charAt(i) + b.charAt(i);
			}
			for (int i = b.length(); i < a.length(); i++) {
				s = s + a.charAt(i);
			}
		}
		else if (lengthB > lengthA) {
			for (int i = 0; i < a.length(); i++) {
				s = s + a.charAt(i) + b.charAt(i);
			}
			for (int i = a.length(); i < b.length(); i++) {
				s = s + b.charAt(i);
			}
		}
		else {
			for (int i = 0; i < b.length(); i++) {
				s = s + a.charAt(i) + b.charAt(i);
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.mixString("abc", "xyz"));
		System.out.println(o.mixString("Hi", "There"));
		System.out.println(o.mixString("xxxx", "There"));

	}

}

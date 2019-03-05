
public class string3 {

	// we'll say that a "triple" in a string is a char appearing three times in a row
	// return the number of triples in the given string
	// the triples may overlap
	public int countTriple(String str) {
		
		int count = 0;
		String s = str.toLowerCase();
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)) {
				count ++;
			}
		}
		
		return count;
		
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.countTriple("abcXXXabc"));
		System.out.println(o.countTriple("xxxabyyyycd"));
		System.out.println(o.countTriple("a"));

	}

}

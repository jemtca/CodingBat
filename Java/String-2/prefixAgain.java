
public class string2 {
	
	// given a string, consider the prefix string made of the first N chars of the string
	// does that prefix string appear somewhere else in the string?
	// assume that the string is not empty and that N is in the range 1..str.length()
	public boolean prefixAgain(String str, int n) {
		
		boolean b = false;
		String prefix = str.substring(0,n);
		
		for (int i = n; i < str.length() - (n - 1); i++) {
			if (prefix.equals(str.substring(i, i + n))) {
				b = true;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.prefixAgain("abXYabc", 1));
		System.out.println(o.prefixAgain("abXYabc", 2));
		System.out.println(o.prefixAgain("abXYabc", 3));

	}

}


public class string2 {
	
	// given two strings, return true if either of the strings appears at the very end of the other string
	// ignoring upper/lower case differences (in other words, the computation should not be "case sensitive")
	public boolean endOther(String a, String b) {
		
		boolean bool = false;
		String small, big;
		
		if (a.length() >= b.length()) {
			small = b;
			big = a;
		}
		else {
			small = a;
			big = b;
		}
		
		if (small.equalsIgnoreCase(big.substring(big.length() - small.length())))
			bool = true;
		
		return bool;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.endOther("Hiabc", "abc"));
		System.out.println(o.endOther("AbC", "HiaBc"));
		System.out.println(o.endOther("abc", "abXabc"));

	}

}

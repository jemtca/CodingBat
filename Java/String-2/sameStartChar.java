
public class string2 {
	
	// returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same
	public boolean sameStartChar(String str) {
		
		boolean b = true;
		
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) {
				b = false;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.sameStartChar("xy*yzz"));
		System.out.println(o.sameStartChar("xy*zzz"));
		System.out.println(o.sameStartChar("*xa*az"));

	}

}


public class string2 {
	
	// return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone
	// so "ab*cd" yields "ad" and "ab**cd" also yields "ad"
	public String startOut(String str) {
		
		String s = "";

		for (int i = 0; i < str.length(); i++) {
		if (i == 0 && str.charAt(i) != '*') {
		  s = s + str.charAt(i);
		}
		if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*') {
		  s = s + str.charAt(i);
		}
		if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*') {
		  s = s.substring(0, s.length() - 1);
		}
		}

		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.startOut("ab*cd"));
		System.out.println(o.startOut("ab**cd"));
		System.out.println(o.startOut("sm*eilly"));

	}

}

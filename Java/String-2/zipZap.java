
public class string2 {
	
	// look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'
	// return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp"
	public String zipZap(String str) {
		
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			if (i < str.length()-2 && str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
				s = s + str.charAt(i) + str.charAt(i+2);
				i = i + 2;
			}
			else {
				s = s + str.charAt(i);
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.zipZap("zipXzap"));
		System.out.println(o.zipZap("zopzop"));
		System.out.println(o.zipZap("zzzopzop"));

	}

}

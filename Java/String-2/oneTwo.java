
public class string2 {
	
	// given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca"
	// repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd"
	// ignore any group of fewer than 3 chars at the end
	public String oneTwo(String str) {
		
		String s = "";
		
		if (str.length() > 2) {
			for (int i = 0; i < str.length() - 2; i = i + 3) {
				s = s + str.charAt(i+1) + str.charAt(i+2) + str.charAt(i);
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.oneTwo("abc"));
		System.out.println(o.oneTwo("tca"));
		System.out.println(o.oneTwo("tcagdo"));

	}

}

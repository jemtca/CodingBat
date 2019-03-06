
public class string3 {

	// given a string, look for a mirror image (backwards) string at both the beginning and end of the given string
	// in other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping)
	public String mirrorEnds(String str) {
		
		String s = "";
		String temp = "";
		boolean end = false;
		
		for (int i = str.length()-1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		
		for (int i = 0; i < str.length() && !end; i++) {
			if (str.charAt(i) == temp.charAt(i)) {
				s = s + str.charAt(i);
			}
			else {
			  end = true;
			}
		}
		
		return s;
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.mirrorEnds("abXYZba"));
		System.out.println(o.mirrorEnds("abca"));
		System.out.println(o.mirrorEnds("aba"));

	}

}

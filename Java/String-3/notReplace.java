
public class string3 {

	// given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not"
	// the word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count 
	public String notReplace(String str) {
		
		String s = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (i-1 >= 0 && Character.isLetter(str.charAt(i-1))
				|| i+2 < str.length() && Character.isLetter(str.charAt(i+2))) {
				s = s + str.charAt(i);
			}
			else if (i+1 < str.length() && str.substring(i, i+2).equals("is")) {
				s = s + "is not";
				i++;
			}
			else {
				s = s + str.charAt(i);
			}
		}
		
		return s;
		
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.notReplace("is test"));
		System.out.println(o.notReplace("is-is"));
		System.out.println(o.notReplace("This is right"));

	}

}

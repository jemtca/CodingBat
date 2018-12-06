
public class string1 {
	
	// given a string of any length, return a new string where the last 2 chars if present, are swapped
	public String lastTwo(String str) {
		
		String s = "";
		
		if (str.length() == 1)
			s = str;
		else if (str.length() >= 2)
			s = str.substring(0, str.length()-2) + String.valueOf(str.charAt(str.length()-1)) + Character.toString(str.charAt(str.length()-2));
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.lastTwo("coding"));
		System.out.println(o.lastTwo("cat"));
		System.out.println(o.lastTwo("ab"));
	
	}

}


public class string1 {
	
	// given a string of even length, return a string made of the middle two chars
	// the string length will be at least 2
	public String middleTwo(String str) {
		
		String s = "";
		
		if (str.length() > 1)
			s = str.substring((str.length()/2)-1, (str.length()/2)+1);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.middleTwo("string"));
		System.out.println(o.middleTwo("code"));
		System.out.println(o.middleTwo("Practice"));
	
	}

}

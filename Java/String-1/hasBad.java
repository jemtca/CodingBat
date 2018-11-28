
public class string1 {
	
	// given a string, return true if "bad" appears starting at index 0 or 1 in the string
	// the string may be any length, including 0
	public boolean hasBad(String str) {
		
		boolean b = false;
		
		if (str.length() >= 3 && str.substring(0, 3).equals("bad"))
			b = true;
		else if (str.length() >= 4 && str.substring(1, 4).equals("bad"))
			b = true;
		
		return b;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.hasBad("badxx"));
		System.out.println(o.hasBad("xbadxx"));
		System.out.println(o.hasBad("xxbadxx"));
	
	}

}


public class string2 {
	
	// we'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string
	// so "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's
	// return true if the given string is xy-balanced
	public boolean xyBalance(String str) {
		
		boolean b = true;
		boolean found = false;
		int yPos = -1;
		
		for (int i = str.length()-1; i >= 0 && !found; i--) {
			if (str.charAt(i) == 'y') {
				yPos = i;
				found = true;
			}
		}

		if (str.substring(yPos).contains("x")) {
			b = false;
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.xyBalance("aaxbby"));
		System.out.println(o.xyBalance("aaxbb"));
		System.out.println(o.xyBalance("yaaxbb"));

	}

}

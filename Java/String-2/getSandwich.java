
public class string2 {
	
	// a sandwich is two pieces of bread with something in between
    // return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread
	public String getSandwich(String str) {
		
		String s = "";
		int front = 0;
		int back = 0;
		boolean found = false;
		int bread = 0;
		
		for (int i = 0; i < str.length()-4 && !found; i ++) {
			if (str.substring(i, i+5).equals("bread")) {
				front = i+5;
				found = true;
			}
		}
		found = false;
		for (int i = str.length(); i >= 5 && !found; i--) {
			if (str.substring(i-5, i).equals("bread")) {
				back = i-5;
				found = true;
			}
		}
		
		for (int i = 0; i < str.length()-4; i++) {
			if (str.substring(i, i+5).equals("bread")) {
				bread++;
			}
		}
		
		if (bread > 1) {
			s = s + str.substring(front, back);
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.getSandwich("breadjambread"));
		System.out.println(o.getSandwich("xxbreadjambreadyy"));
		System.out.println(o.getSandwich("xxbreadyy"));

	}

}

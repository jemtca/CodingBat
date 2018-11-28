
public class string1 {
	
	// given a string, return true if the first 2 chars in the string also appear at the end of the string
	public boolean frontAgain(String str) {
		
		boolean b = false;
		
		if (str.length() > 1)
			if (str.substring(0, 2).equals(str.substring(str.length()-2)))
				b = true;
		
		return b;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.frontAgain("edited"));
		System.out.println(o.frontAgain("edit"));
		System.out.println(o.frontAgain("ed"));
	
	}

}

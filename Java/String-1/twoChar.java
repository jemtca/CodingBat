
public class string1 {
	
	// given a string and an index, return a string length 2 starting at the given index
	// if the index is too big or too small to define a string length 2, use the first 2 chars
	// the string length will be at least 2
	public String twoChar(String str, int index) {
		
		String s = "";
		
		if (str.length() > 1)
			if (index < 0 || str.length() - index < 2)
				s = str.substring(0, 2);
			else
				s = str.substring(index, index+2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.twoChar("java", 0));
		System.out.println(o.twoChar("java", 2));
		System.out.println(o.twoChar("java", 3));
	
	}

}

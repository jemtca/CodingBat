
public class string1 {
	
	// given a string, if the first or last chars are 'x', return the string without those 'x' chars
    // otherwise return the string unchanged
	public String withoutX(String str) {
		
		String s = "";
		
		if (str.length() > 0) {
			if (str.length() > 1 && str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
				s = str.substring(1, str.length()-1);
			else if (str.charAt(0) == 'x')
				s = str.substring(1);
			else if (str.charAt(str.length()-1) == 'x')
				s = str.substring(0, str.length()-1);
			else
				s = str;
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.withoutX("xHix"));
		System.out.println(o.withoutX("xHi"));
		System.out.println(o.withoutX("Hxix"));
	
	}

}


public class string1 {
	
	// given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars
	// otherwise return the string unchanged
	public String withoutX2(String str) {
		
		String s = "";
		
		if (str.length() == 1) {
			if (str.charAt(0) != 'x')
				s = str;
		}
		else if (str.length() > 1){
			if (str.charAt(0) == 'x' && str.charAt(1) != 'x')
				s = str.substring(1);
			else if (str.charAt(0) != 'x' && str.charAt(1) == 'x')
				s = Character.toString(str.charAt(0)) + str.substring(2);
			else if (str.charAt(0) == 'x' && str.charAt(1) == 'x')
				s = str.substring(2);
			else
				s = str;
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.withoutX2("xHi"));
		System.out.println(o.withoutX2("Hxi"));
		System.out.println(o.withoutX2("Hi"));
	
	}

}

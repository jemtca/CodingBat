
public class string1 {
	
	// given a string, return a version without the first 2 chars
	// except keep the first char if it is 'a' and keep the second char if it is 'b'
	// the string may be any length
	public String deFront(String str) {
		
		String s = "";
		
		if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
			s = str;
		else if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
			s = Character.toString(str.charAt(0)) + str.substring(2);
		else if (str.charAt(0) != 'a' && str.charAt(1) == 'b')
			s = str.substring(1);
		else
			s = str.substring(2);
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.deFront("Hello"));
		System.out.println(o.deFront("java"));
		System.out.println(o.deFront("away"));
	
	}

}


public class string1 {
	
	// given a string and an int n, return a string made of the first and last n chars from the string
	// the string length will be at least n
	public String nTwice(String str, int n) {
		
		String s = "";
		
		if (str.length() >= n)
			s = str.substring(0, n) + str.substring(str.length()-n);
			
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.nTwice("Hello", 2));
		System.out.println(o.nTwice("Chocolate", 3));
		System.out.println(o.nTwice("Chocolate", 1));
	
	}

}

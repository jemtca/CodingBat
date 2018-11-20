
public class string1 {
	
	// given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back
	// the string will be non-empty
	public String theEnd(String str, boolean front) {
		
		return front ? str.substring(0, 1) : str.substring(str.length()-1);
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.theEnd("Hello", true));
		System.out.println(o.theEnd("Hello", false));
		System.out.println(o.theEnd("oh", true));

	}

}

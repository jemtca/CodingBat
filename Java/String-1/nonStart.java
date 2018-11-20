
public class string1 {
	
	// given 2 strings, return their concatenation, except omit the first char of each
	// the strings will be at least length 1
	public String nonStart(String a, String b) {
		
		return a.substring(1) + b.substring(1);
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.nonStart("Hello", "There"));
		System.out.println(o.nonStart("java", "code"));
		System.out.println(o.nonStart("shotl", "java"));

	}

}

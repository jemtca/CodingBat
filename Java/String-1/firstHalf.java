
public class string1 {
	
	// given a string of even length, return the first half
	public String firstHalf(String str) {
		
		return str.substring(0, str.length()/2);
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.firstHalf("WooHoo"));
		System.out.println(o.firstHalf("HelloThere"));
		System.out.println(o.firstHalf("abcdef"));

	}

}

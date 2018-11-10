
public class warmup2 {

	// given a non-empty string like "Code" return a string like "CCoCodCode"
	public String stringSplosion(String str) {
	
		String s = "";
		
		for (int i = 0; i < str.length(); i++) {
			s = s + str.substring(0, i+1);
		}
		
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		System.out.println(o.stringSplosion("Code"));
		System.out.println(o.stringSplosion("abc"));
		System.out.println(o.stringSplosion("ab"));

	}

}


public class warmup1 {

	// this function return true if the two given not-negative int values have the same last digit
	public boolean lastDigit (int a, int b) {
		
		boolean bool = false;
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		
		
		if (s1.charAt(s1.length() -1) == s2.charAt(s2.length() -1))
			bool = true;
		
		return bool;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.lastDigit(7, 177777777));
		System.out.println(o.lastDigit(6, 17));
		System.out.println(o.lastDigit(3, 113));

	}
	
}

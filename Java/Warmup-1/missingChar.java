
public class warmup1 {

	// this function return a new string where the char at index n has been removed
	public String missingChar(String str, int n) {
		
		String s = "";
		
		if (n >= 0 && n <= str.length()) {
			if (n == 0) // n = 0
				s = str.substring(1);
			else if (n == str.length()) // n = last position
				s = str.substring(0, str.length() - 1);
			else { // n = not 0 neither last position
				String s1 = str.substring(0, n);
				String s2 = str.substring(n + 1);
				s = s1 + s2;
			}
		}
		else {
			System.out.print("Wrong index.");
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		String s;
		
		s = o.missingChar("kitten", 1);
		System.out.println(s);
		
		s = o.missingChar("kitten", 0);
		System.out.println(s);
		
		s = o.missingChar("kitten", 4);
		System.out.println(s);
		
	}
	
}

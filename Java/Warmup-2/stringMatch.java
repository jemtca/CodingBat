
public class warmup2 {

	// this function return the number of the positions where they contain the same length 2 substring
	public int stringMatch(String a, String b) {
	
		int count = 0;
		int length = Math.min(a.length(), b.length());
		
		for (int i = 0; i < length - 1; i++) {
			if (a.substring(i, i+2).compareTo(b.substring(i, i+2)) == 0)
				count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();

		System.out.println(o.stringMatch("xxcaazz", "xxbaaz"));
		System.out.println(o.stringMatch("abc", "abc"));
		System.out.println(o.stringMatch("abc", "axc"));

	}

}

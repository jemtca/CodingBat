
public class ap1 {
	
	// given an array of strings, return a new array containing the first n strings
	// n will be in the range 1..length
	public String[] wordsFront(String[] words, int n) {
		
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = words[i];
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] s = {"a", "b", "c", "d"};
		
		String[] temp;
		
		
		temp = o.wordsFront(s, 1);
		System.out.println("[" + temp[0] + "]");
		
		temp = o.wordsFront(s, 2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.wordsFront(s, 3);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");

	}

}


public class string2 {
	
	// given a string and an int n, return a string made of n repetitions of the last n characters of the string
	// you may assume that n is between 0 and the length of the string, inclusive
	public String repeatEnd(String str, int n) {
		
		String s = "";
		String last = str.substring(str.length() - n);
		
		for (int i = 0; i < n; i++) {
			s = s + last;
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.repeatEnd("Hello", 3));
		System.out.println(o.repeatEnd("Hello", 2));
		System.out.println(o.repeatEnd("Hello", 1));

	}

}

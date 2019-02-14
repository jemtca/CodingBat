
public class string2 {
	
	// given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string
	public String repeatSeparator(String word, String sep, int count) {
		
		String s = "";
		
		if (count > 1) {
			for (int i = 0; i < count-1; i++) {
				s = s + word + sep;
			}
		}
		
		if (count >= 1) {
		  s = s + word;
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.repeatSeparator("Word", "X", 3));
		System.out.println(o.repeatSeparator("This", "And", 2));
		System.out.println(o.repeatSeparator("This", "And", 1));

	}

}

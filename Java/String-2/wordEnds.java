
public class string2 {
	
	// given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string
	// ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words
	public String wordEnds(String str, String word) {
		
		String s = "";

		for (int i = 0; i <= str.length()-word.length(); i++) {
			if (str.substring(i, i+word.length()).equals(word) && str.length() > word.length()) {
				if (i == 0) {
					s = s + str.charAt(i+word.length());
				}
				else if (i == str.length()-word.length()) {
					s = s + str.charAt(i-1);
				}
				else {
					s = s + str.charAt(i-1) + str.charAt(i+word.length());
				}
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.wordEnds("abcXY123XYijk", "XY"));
		System.out.println(o.wordEnds("XY123XY", "XY"));
		System.out.println(o.wordEnds("XY1XY", "XY"));

	}

}

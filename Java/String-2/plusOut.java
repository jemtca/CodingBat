
public class string2 {
	
	// given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+")
	// except for appearances of the word string which are preserved unchanged
	public String plusOut(String str, String word) {
		
		String s = str;

		if (s.contains(word)) {
			s = s.replace(word, "--");
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '-') {
				s = s.replace(s.substring(i, i+1), "+");
			}
		}
		
		s = s.replace("--", word);
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.plusOut("12xy34", "xy"));
		System.out.println(o.plusOut("12xy34", "1"));
		System.out.println(o.plusOut("12xy34xyabcxy", "xy"));

	}

}

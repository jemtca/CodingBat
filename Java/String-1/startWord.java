
public class string1 {
	
	// given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly
	// on a match, return the front of the string, or otherwise return the empty string
	// the word will be at least length 1
	public String startWord(String str, String word) {
		
		String s = "";
		
		if (!(str.length() < word.length()) && word.substring(1).equals(str.substring(1, word.length())))
			s = str.substring(0, word.length());
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.startWord("hippo", "hi"));
		System.out.println(o.startWord("hippo", "xip"));
		System.out.println(o.startWord("hippo", "i"));
		
	}

}

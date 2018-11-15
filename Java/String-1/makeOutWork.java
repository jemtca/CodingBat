
public class string1 {
	
	// given an "out" string length 4, such as "<<>>", and a word
	// return a new string where the word is in the middle of the out string
	public String makeOutWork(String out, String word) {
		
		return out.substring(0,2) + word + out.substring(2);
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.makeOutWork("<<>>", "Yay"));
		System.out.println(o.makeOutWork("<<>>", "WooHoo"));
		System.out.println(o.makeOutWork("[[]]", "word"));

	}

}

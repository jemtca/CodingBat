
public class string1 {
	
	// given tag and word strings, create the HTML string with tags around the word
	public String makeTags(String tag, String word) {
		
		return "<" + tag + ">" + word + "</" + tag + ">";
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.makeTags("i", "Yey"));
		System.out.println(o.makeTags("i", "Hello"));
		System.out.println(o.makeTags("cite", "Yay"));
	
	}

}

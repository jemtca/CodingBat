
public class string1 {
	
	// given a string, return true if it ends in "ly"
	public boolean endsLy(String str) {
		
		return str.endsWith("ly") ? true : false;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.endsLy("oddly"));
		System.out.println(o.endsLy("y"));
		System.out.println(o.endsLy("oddy"));

	}

}

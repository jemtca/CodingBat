
public class string3 {

	// given a string, return the longest substring that appears at both the beginning and end of the string without overlapping
	public String sameEnds(String str) {
		
		String s = "";
		int start = 0;
		int end = 1;
		
		for (int i = 0; i < str.length()/2; i++) {
			if (str.substring(start, i+1).equals(str.substring(str.length()-end))) {
				s = str.substring(start, i+1);
			}
			end++;
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.sameEnds("abXYab"));
		System.out.println(o.sameEnds("xx"));
		System.out.println(o.sameEnds("xxx"));

	}

}

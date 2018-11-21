
public class string1 {
	
	// given a string of odd length, return the string length 3 from its middle
	// the string length will be at least 3
	public String middleThree(String str) {
		
		String s = "";
		int middle = str.length()/2;
		
		s = str.substring(middle-1, middle+2); 
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.middleThree("Candy"));
		System.out.println(o.middleThree("and"));
		System.out.println(o.middleThree("solving"));

	}

}

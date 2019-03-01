
public class string3 {

	// given a string, return the sum of the numbers appearing in the string, ignoring all other characters
	// a number is a series of 1 or more digit chars in a row
	public int sumNumbers(String str) {
		
		int sum = 0;
		String s = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				if (i < str.length()-1 && Character.isDigit(str.charAt(i+1))) {
					s = s + str.charAt(i);
				}
				else {
					s = s + str.charAt(i);
					sum = sum + Integer.parseInt(s);
					s = "";
				}
			}
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.sumNumbers("abc123xyz"));
		System.out.println(o.sumNumbers("aa11b33"));
		System.out.println(o.sumNumbers("7 11"));

	}

}

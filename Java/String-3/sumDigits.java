
public class string3 {

	// given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters
	// return 0 if there are no digits in the string
	public int sumDigits(String str) {
		
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Integer.parseInt(str.substring(i, i+1));
			}
		}
		
		return sum; 
		
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.sumDigits("aa1bc2d3"));
		System.out.println(o.sumDigits("aa11b33"));
		System.out.println(o.sumDigits("Chocolate"));

	}

}

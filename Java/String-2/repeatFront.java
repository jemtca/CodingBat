
public class string2 {
	
	// given a string and an int n, return a string made of the first n characters of the string
	// followed by the first n-1 characters of the string, and so on
	// you may assume that n is between 0 and the length of the string, inclusive
	public String repeatFront(String str, int n) {
		
		String s = "";
		int j = n;
		
		for (int i = 0; i < n; i++) {
			s = s + str.substring(0,j);
			j--;
		}
		
		return s;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.repeatFront("Chocolate", 4));
		System.out.println(o.repeatFront("Chocolate", 3));
		System.out.println(o.repeatFront("Ice Cream", 2));

	}

}

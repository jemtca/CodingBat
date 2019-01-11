
public class logic1 {

	// given three ints, a b c, return true if two or more of them have the same rightmost digit
	// the ints are non-negative
	public boolean lastDigit(int a, int b, int c) {
		
		boolean bool = false;

		if (a >= 0 && b >= 0 && c >= 0) {
			if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10)
				bool = true;
		}

		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.lastDigit(23, 19, 13));
		System.out.println(o.lastDigit(23, 19, 12));
		System.out.println(o.lastDigit(23, 19, 3));

	}

}

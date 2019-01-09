
public class logic1 {

	// the number 6 is a truly great number
	// given two int values, a and b, return true if either one is 6
    // or if their sum or difference is 6
	public boolean love6(int a, int b) {
		
		boolean bool = false;
		
		if (a == 6 || b == 6)
			bool = true;
		else if (a + b == 6)
			bool = true;
		else if (a - b == 6 || b - a == 6)
			bool = true;
		
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.love6(6, 4));
		System.out.println(o.love6(4, 5));
		System.out.println(o.love6(1, 5));

	}

}

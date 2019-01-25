
public class logic1 {

	// given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7
	// however, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		
		boolean bool = false;
		
		if (!equalOk) {
			if (c > b && b > a)
				bool = true;
		}
		else {
			if (c >= b && b >= a)
				bool = true;
		}
		
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.inOrderEqual(2, 5, 11, false));
		System.out.println(o.inOrderEqual(5, 7, 6, false));
		System.out.println(o.inOrderEqual(5, 5, 7, true));

	}

}

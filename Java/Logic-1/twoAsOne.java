
public class logic1 {

	// given three ints, a b c, return true if it is possible to add two of the ints to get the third
	public boolean twoAsOne(int a, int b, int c) {
		
		boolean bool = false;

		if (a + b == c || b + c == a || a + c == b)
			bool = true;

		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.twoAsOne(1, 2, 3));
		System.out.println(o.twoAsOne(3, 1, 2));
		System.out.println(o.twoAsOne(3, 2, 2));

	}

}

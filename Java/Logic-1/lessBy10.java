
public class logic1 {

	// given three ints, a b c, return true if one of them is 10 or more less than one of the others
	public boolean lessBy10(int a, int b, int c) {
		
		boolean bool = false;
		
		if (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10)
			bool = true;
			
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.lessBy10(1, 7, 11));
		System.out.println(o.lessBy10(1, 7, 10));
		System.out.println(o.lessBy10(11, 1, 7));

	}

}

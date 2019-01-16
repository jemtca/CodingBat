
public class logic1 {

	// given a number n, return true if n is in the range 1..10, inclusive
	// unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10
	public boolean in1To10(int n, boolean outsideMode) {
		
		boolean b = false;
		
		if ((n > 0 && n < 11 && !outsideMode) || (outsideMode && (n <= 1 || n >= 10)))
			b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.in1To10(5, false));
		System.out.println(o.in1To10(11, false));
		System.out.println(o.in1To10(11, true));

	}

}

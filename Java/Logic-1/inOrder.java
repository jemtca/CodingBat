
public class logic1 {

	// given three ints, a b c, return true if b is greater than a, and c is greater than b
	// however, with the exception that if "bOk" is true, b does not need to be greater than a
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		
		boolean bool = false;
		
		if ((b > a && c > b && !bOk) || (bOk && c > b))
			bool = true;
			
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.inOrder(1, 2, 4, false));
		System.out.println(o.inOrder(1, 2, 1, false));
		System.out.println(o.inOrder(1, 1, 2, true));

	}

}

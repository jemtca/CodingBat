
public class logic2 {
	
	// given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1)
	// while the other is "far", differing from both other values by 2 or more 
	public boolean closeFar(int a, int b, int c) {
		
		boolean bool = false;
		int close; 
		int far;
		
		if (Math.abs(b - a) < Math.abs(c - a)) {
			close = b;
			far = c;
		}
		else {
			close = c;
			far = b;
		}
		
		if (Math.abs(a - close) < 2 && (Math.abs(far - close) > 1 && Math.abs(far - a) > 1))
			bool = true;
		
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.closeFar(1, 2, 10));
		System.out.println(o.closeFar(1, 2, 3));
		System.out.println(o.closeFar(4, 1, 3));
		
	}

}

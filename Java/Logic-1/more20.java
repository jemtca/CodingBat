
public class logic1 {

	// return true if the given non-negative number is 1 or 2 more than a multiple of 20
	public boolean more20(int n) {
		
		boolean b = false;
		
		if (n % 20 == 1 || n % 20 == 2)
			b = true;
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.more20(20));
		System.out.println(o.more20(21));
		System.out.println(o.more20(22));

	}

}


public class logic1 {

	// return true if the given non-negative number is a multiple of 3 or 5, but not both
	public boolean old35(int n) {
		
		boolean b = false;
		
		if (n >= 0)
			if (n % 3 == 0 || n % 5 == 0)
				b = true;
			if (n % 3 == 0 && n % 5 == 0)
				b = false;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.old35(3));
		System.out.println(o.old35(10));
		System.out.println(o.old35(15));

	}

}

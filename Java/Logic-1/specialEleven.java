
public class logic1 {

	// we'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11
	// return true if the given non-negative number is special
	public boolean specialEleven(int n) {
		
		boolean b = false;
		
        if (n >= 0) {
            if (n % 11 == 0 || n % 11 == 1)
                b = true;
        }
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.specialEleven(22));
		System.out.println(o.specialEleven(23));
		System.out.println(o.specialEleven(24));

	}

}

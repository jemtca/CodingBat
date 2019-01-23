
public class logic1 {

	// return true if the given non-negative number is 1 or 2 less than a multiple of 20
	// so for example 38 and 39 return true, but 40 returns false
	public boolean less20(int n) {
		
		boolean b = false;
		
        if (n >= 0) {
            if (n % 20 == 18 || n % 20 == 19)
                b = true;
        }

		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.less20(18));
		System.out.println(o.less20(19));
		System.out.println(o.less20(20));

	}

}


public class logic2 {
	
	// given 3 int values, a b c, return their sum
	// however, if one of the values is the same as another of the values, it does not count towards the sum
	public int loneSum(int a, int b, int c) {
		
		int sum = a + b + c;
		
	    if (a == b && a == c)
	      sum = 0;
	    else if (a == b)
	      sum = c;
	    else if (a == c)
	      sum = b;
	    else if (b == c)
	      sum = a;
			
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.loneSum(1, 2, 3));
		System.out.println(o.loneSum(3, 2, 3));
		System.out.println(o.loneSum(3, 3, 3));
		
	}

}

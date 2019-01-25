
public class logic1 {

	// given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a
	// if the sum has more digits than a, just return a without b
	public int sumLimit(int a, int b) {
		
		int x = a + b;
		
		String sum = String.valueOf(x);
		String s1 = String.valueOf(a);
		
		if (sum.length() > s1.length())
			x = a;
			
		return x;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.sumLimit(2, 3));
		System.out.println(o.sumLimit(8, 3));
		System.out.println(o.sumLimit(8, 1));

	}

}


public class logic1 {

	// given 2 ints, a and b, return their sum
	// however, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20
	public int sortaSum(int a, int b) {
		
		int sum = 0;
		
		if (a + b < 10 || a + b > 19)
			sum = a + b;
		else
			sum = 20;
			
		return 	sum;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.sortaSum(3, 4));
		System.out.println(o.sortaSum(9, 4));
		System.out.println(o.sortaSum(10, 11));

	}

}

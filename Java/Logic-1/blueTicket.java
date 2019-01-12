
public class logic1 {

	// you have a blue lottery ticket, with ints a, b, and c on it
	// this makes three pairs, which we'll call ab, bc, and ac
	// consider the sum of the numbers in each pair
	// if any pair sums to exactly 10, the result is 10
	// otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5
	// otherwise the result is 0
	public int blueTicket(int a, int b, int c) {
		
		int max = 0;

		if (a + b == 10 || b + c == 10 || a + c == 10)
			max = 10;
		else if (a + b == b + c + 10 || a + b == a + c + 10)
			max = 5;

		return max;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.blueTicket(9, 1, 0));
		System.out.println(o.blueTicket(9, 2, 0));
		System.out.println(o.blueTicket(6, 1, 4));

	}

}


public class logic2 {
	
	// for this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20
	// alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10
	// given 3 ints, a b c, return the sum of their rounded values
	public int roundSum(int a, int b, int c) {
		
		return round10(a) + round10(b) + round10(c);
		
	}
	
	public int round10 (int num) {
		
		int x = 0;
		
		if (num % 10 < 5)
			x = num - (num % 10);
		else
			x = num + (10 - (num % 10));
		
		return x;

	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.roundSum(16, 17, 18));
		System.out.println(o.roundSum(12, 13, 14));
		System.out.println(o.roundSum(6, 4, 4));
		
	}

}

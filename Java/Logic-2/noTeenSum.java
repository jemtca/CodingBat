
public class logic2 {
	
	// given 3 int values, a b c, return their sum
	// however, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens
	public int noTeenSum(int a, int b, int c) {
		
		int sum = a + b + c;
		
		if (fixTeen(a) == 0 && fixTeen(b) == 0 && fixTeen(c) == 0)
			sum = 0;
		else if (fixTeen(a) != 0 && fixTeen(b) == 0 && fixTeen(c) == 0)
			sum = a;
		else if (fixTeen(a) != 0 && fixTeen(b) != 0 && fixTeen(c) == 0)
			sum = a + b;
		else if (fixTeen(a) == 0 && fixTeen(b) != 0 && fixTeen(c) == 0)
			sum = b;
		else if (fixTeen(a) == 0 && fixTeen(b) != 0 && fixTeen(c) != 0)
			sum = b + c;
		else if (fixTeen(a) == 0 && fixTeen(b) == 0 && fixTeen(c) != 0)
			sum = c;
		else if (fixTeen(a) != 0 && fixTeen(b) == 0 && fixTeen(c) != 0)
			sum = a + c;
			
		return sum;
		
	}
	
	public int fixTeen(int n) {
		
		if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19)
			n = 0;
		
		return n;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.noTeenSum(1, 2, 3));
		System.out.println(o.noTeenSum(2, 13 ,1));
		System.out.println(o.noTeenSum(2, 1, 14));
		
	}

}


public class logic2 {
	
	// given 3 int values, a b c, return their sum
	// however, if one of the values is 13 then it does not count towards the sum and values to its right do not count
	// so for example, if b is 13, then both b and c do not count
	public int luckySum(int a, int b, int c) {
		
		int sum = a + b + c;
		
		if (a == 13)
			sum = 0;
		else if (b == 13)
			sum = a;
		else if (c == 13)
			sum = a + b;
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.luckySum(1, 2, 3));
		System.out.println(o.luckySum(1, 2, 13));
		System.out.println(o.luckySum(1, 13, 3));
		
	}

}

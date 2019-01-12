
public class logic1 {

	// given two int values, return whichever value is larger
	// however if the two values have the same remainder when divided by 5, then the return the smaller value
	// however, in all cases, if the two values are the same, return 0
	public int maxMod5(int a, int b) {
		
		int max = 0;
		
		if (a % 5 == b % 5 && a == b)
			max = 0;
		else if (a % 5 == b % 5)
			if (a < b)
				max = a;
			else
				max = b;
		else
			if (a < b)
				max = b;
			else
				max = a;
			
		return max;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.maxMod5(2, 3));
		System.out.println(o.maxMod5(6, 2));
		System.out.println(o.maxMod5(3, 2));

	}

}

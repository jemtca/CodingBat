
public class logic1 {

	// given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky
	// so if either value is a teen, just return 19
	public int teenSum(int a, int b) {
		
		int sum = 0;
		
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19)
			sum = 19;
		else
			sum = a + b;
		
			
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.teenSum(3, 4));
		System.out.println(o.teenSum(10, 13));
		System.out.println(o.teenSum(13, 2));

	}

}

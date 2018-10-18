
public class warmup1 {

	// this function return the larger value of the two given int values that is in the range 10..20
	// return 0 if neither is in that range
	public int max1020(int a, int b) {

		int max = 0;
		
		if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20))
			max = Math.max(a, b);
		if ((a >= 10 && a <= 20) && !(b >= 10 && b <= 20))
			max = a;
		if (!(a >= 10 && a <= 20) && (b >= 10 && b <= 20))
			max = b;
			
		return max;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.max1020(11, 19));
		System.out.println(o.max1020(19, 11));
		System.out.println(o.max1020(11, 9));

	}
	
}

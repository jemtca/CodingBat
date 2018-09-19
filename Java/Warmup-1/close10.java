
public class warmup1 {

	// given two int numbers, the function returns the nearest number to the value 10
	// return 0 in the event of a tie
	public int close10(int a, int b) {
		
		int x = 0;
		int y = Math.abs(10 - a);
		int z = Math.abs(10 - b);
		
		if (y < z)
			x = a;
		if (y > z)
			x = b;
			
		return x;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.close10(8,13));
		System.out.println(o.close10(13,8));
		System.out.println(o.close10(13,7));
		
	}
	
}


public class warmup1 {

	// this function return true if the two given int values are both in the range 30..40 inclusive,
	// or they are both in the range 40..50 inclusive
	public boolean in3050(int a, int b) {
		
		boolean bool = false;

		if (((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)))
			bool = true;
		
		return bool;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.in3050(30, 31));
		System.out.println(o.in3050(30, 41));
		System.out.println(o.in3050(40, 50));

	}
	
}

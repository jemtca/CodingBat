
public class warmup1 {

	// this function return true if either of the two given int values is in the range 10..20 inclusive
	public boolean in1020(int a, int b) {

		boolean bool = false;
		
		if ((a >= 10 && a <= 20) || (b >=10 && b <= 20))
			bool = true;
			
		return bool;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.in1020(12, 99));
		System.out.println(o.in1020(21, 12));
		System.out.println(o.in1020(8, 99));

	}
	
}

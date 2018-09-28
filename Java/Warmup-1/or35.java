
public class warmup1 {

	// this function return true if the given non-negative number is multiple of 3 or multiple or 5
	public boolean or35(int n) {
		
		boolean b = false;

		if (Math.abs(n) % 3 == 0 || Math.abs(n) % 5 == 0)
			b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.or35(3));
		System.out.println(o.or35(10));
		System.out.println(o.or35(8));

	}
	
}

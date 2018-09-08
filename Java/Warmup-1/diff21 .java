
public class warmup1 {

	// this function return the absolute difference between n and 21,
	// except return double the absolute difference if n is over 21.
	public int diff21(int n) {
		
		return n <= 21 ? Math.abs(n -21): Math.abs((n - 21) * 2);
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		int x;
		
		x = o.diff21(19);
		System.out.println(x);
		
		x = o.diff21(10);
		System.out.println(x);
		
		x = o.diff21(21);
		System.out.println(x);
		
	}
	
}

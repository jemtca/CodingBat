
public class warmup1 {

	// this function return true if the numbers given are in range 13-19 inclusive
	public boolean hasTeen(int a, int b, int c) {
		
		boolean bool = false;
		
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19))
			bool = true;
		
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.hasTeen(13,20,10));
		System.out.println(o.hasTeen(20,19,10));
		System.out.println(o.hasTeen(20,10,13));
		
	}
	
}

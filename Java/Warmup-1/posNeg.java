
public class warmup1 {

	// this function return true if one given int in positive and the other given int is negative,
	// except if the parameter negative is true and both int are negative
	public boolean posNeg(int a, int b, boolean negative) {
		
		boolean bool = false;

		if (negative && a < 0 && b < 0) {
			bool = true;
		}
		else {
			if (!negative && ((a > 0 && b < 0) || (a < 0 && b > 0)))
				bool = true;
			
		}
			
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.posNeg(1, -1, false));
		System.out.println(o.posNeg(-1, 1, false));
		System.out.println(o.posNeg(-4, -5, true));

	}
	
}

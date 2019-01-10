
public class logic1 {

	// given a non-negative number "num", return true if num is within 2 of a multiple of 10
	public boolean nearTen(int num) {
		
		boolean b = false;
		
		if (num >= 0)
			if (num % 10 <= 2 || num % 10 >= 8)
				b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.nearTen(12));
		System.out.println(o.nearTen(17));
		System.out.println(o.nearTen(19));

	}

}


public class logic1 {

	// given two ints, each in the range 10..99
	// return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23
	public boolean shareDigit(int a, int b) {
		
		boolean bool = false;
		
		if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
			if ((a / 10 == b / 10 || a / 10 == b % 10) || (a % 10 == b / 10 || a % 10 == b % 10 ))
				bool = true;
		}
			
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.shareDigit(12, 23));
		System.out.println(o.shareDigit(12, 43));
		System.out.println(o.shareDigit(12, 44));

	}

}

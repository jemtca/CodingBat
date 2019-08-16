
public class ap1 {
	
	// we'll say that a positive int divides itself if every digit in the number divides into the number evenly
	// so for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly
	// we'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself
	public boolean dividesSelf(int n) {
		
		boolean b = true;
		int length = String.valueOf(n).length();
		int temp = n;
		int temp2 = n;

		for (int i = 0; i < length; i++) {
			temp = temp2 % 10;
			if (temp == 0 || n % temp != 0) {
				b = false;
			}
			temp2 = temp2 / 10;
		}
		
		return b;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		//System.out.println(o.dividesSelf(128));
		System.out.println(o.dividesSelf(213));
		//System.out.println(o.dividesSelf(120));

	}

}

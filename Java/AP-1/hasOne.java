
public class ap1 {
	
	// given a positive int n, return true if it contains a 1 digit
	// note: use % to get the rightmost digit, and / to discard the rightmost digit
	public boolean hasOne(int n) {
		
		boolean b = false;
		int length = String.valueOf(n).length();
		int temp = n;
		
		for (int i = 0; i < length && !b; i++) {
			if (temp % 10 == 1) {
				b = true;
			}
			temp = temp / 10;;
		}
		
		return b;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		System.out.println(o.hasOne(10));
		System.out.println(o.hasOne(22));
		System.out.println(o.hasOne(220));

	}

}

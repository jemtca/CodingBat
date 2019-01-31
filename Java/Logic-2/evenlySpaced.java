
public class logic2 {
	
	// given three ints, a b c, one of them is small, one is medium and one is large
	// return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large
	public boolean evenlySpaced(int a, int b, int c) {
		
		boolean bool = false;
		int small;
		int large;
		
		small = Math.min(a, b);
		small = Math.min(small, c);
		
		large = Math.max(a, b);
		large = Math.max(large, c);
        
        int medium = (a + b + c) - (small + large);
		
		if (medium - small == large -medium)
			bool = true;
			
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.evenlySpaced(2, 4, 6));
		System.out.println(o.evenlySpaced(4, 6, 2));
		System.out.println(o.evenlySpaced(4, 6, 3));
		
	}

}

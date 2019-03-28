
public class array2 {

	// given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1
	// the given n may be 0, in which case just return a length 0 array
	// you do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works
	public int[] fizzArray(int n) {
		
		int[] x = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = i;
		}

		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] temp;
		
		temp = o.fizzArray(4);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.fizzArray(1);
		System.out.println("[" + temp[0] + "]");
		
		temp = o.fizzArray(10);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + ", " + 
		temp[5] + ", " + temp[6] + ", " + temp[7] + ", " + temp[8] + ", " + temp[9] + "]");

	}

}

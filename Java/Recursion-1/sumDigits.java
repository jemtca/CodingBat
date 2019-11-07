
public class recursion1 {
	
	// given a non-negative int n, return the sum of its digits recursively
	public int sumDigits(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return n % 10 + sumDigits(n/10);
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.sumDigits(126));
		System.out.println(o.sumDigits(49));
		System.out.println(o.sumDigits(12));
		
	}

}

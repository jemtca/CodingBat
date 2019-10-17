
public class recursion1 {
	
	// given a non-negative int n, compute recursively the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4
	public int count8(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		if (n % 10 == 8) {
			if ((n/10) % 10 == 8) {
				return 2 + count8(n/10);
			}
			else {
				return 1 + count8(n/10);
			}
		}
		else {
			return count8(n/10);
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.count8(8));
		System.out.println(o.count8(818));
		System.out.println(o.count8(8818));
		
	}

}

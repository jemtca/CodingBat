
public class recursion1 {
	
	// given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2
	public int count7(int n) {
		
		int count = 0;
		
		if (n == 0) {
			return count;
		}

		if (n % 10 == 7) {
			count++;
		}
		
		return count + count7(n/10);
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.count7(717));
		System.out.println(o.count7(7));
		System.out.println(o.count7(123));

	}

}


public class recursion1 {
	
	// given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1
	public int factorial(int n) {
		
		if (n == 1) {
			return 1;
		}
		
		return n * factorial(n-1);
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.factorial(1));
		System.out.println(o.factorial(2));
		System.out.println(o.factorial(3));

	}

}


public class recursion1 {
	
	// given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared)
	public int powerN(int base, int n) {
		
		if (n == 0) {
			return 1;
		}
		
		return base * powerN(base, n-1);
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.powerN(3, 1));
		System.out.println(o.powerN(3, 2));
		System.out.println(o.powerN(3, 3));
		
	}

}

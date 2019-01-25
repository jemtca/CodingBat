
public class logic1 {

	// you have a green lottery ticket, with ints a, b, and c on it
	// if the numbers are all different from each other, the result is 0
	// if all of the numbers are the same, the result is 20
	// if two of the numbers are the same, the result is 10
	public int greenTickets(int a, int b, int c) {
		
		int x = 0;
		
		if (a == b && a == c && b == c)
			x = 20;
		else if (a == b || a == c || b == c)
			x = 10;
			
		return x;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.greenTickets(1, 2, 3));
		System.out.println(o.greenTickets(2, 2, 2));
		System.out.println(o.greenTickets(1, 1, 2));

	}

}

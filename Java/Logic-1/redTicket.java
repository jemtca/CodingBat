
public class logic1 {

	// you have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2
	// if they are all the value 2, the result is 10
	// otherwise if they are all the same, the result is 5
	// otherwise so long as both b and c are different from a, the result is 1
	// otherwise the result is 0
	public int redTicket(int a, int b, int c) {
		
		int x = 0;
		
		if (a == 2 && b == 2 && c == 2)
			x = 10;
		else if((a == 0 && b == 0 && c == 0) ||(a == 1 && b == 1 && c == 1))
			x = 5;
		else if (b != a && c != a)
			x = 1;
			
		return x;
		
	}
	
	public static void main(String[] args) {
		
		logic1 o = new logic1();
		
		System.out.println(o.redTicket(2, 2, 2));
		System.out.println(o.redTicket(2, 2, 1));
		System.out.println(o.redTicket(0, 0, 0));

	}

}

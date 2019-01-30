
public class logic2 {
	
	// given 2 int values greater than 0, return whichever value is nearest to 21 without going over
	// return 0 if they both go over
	public int blackjack(int a, int b) {
		
		int x = 0;
		
		if (a > 0 && b > 0) {
			if (a <= 21 && b <= 21) {
				x = Math.max(a, b);
			}
			else if (a <= 21 && b > 21) {
				x = a;
			}
			else if (a > 21 && b <= 21) {
				x = b;
			}
		}
			
		return x;
		
	}
	
	public static void main(String[] args) {
		
		logic2 o = new logic2();
		
		System.out.println(o.blackjack(19, 21));
		System.out.println(o.blackjack(21, 19));
		System.out.println(o.blackjack(19, 22));
		
	}

}


public class warmup1 {

	// this function return the largest value of the three given int values
	public int intMax(int a, int b, int c) {

		int max = 0;
		
		if (a > b && a > c)
			max = a;
		if (b > a && b > c)
			max = b;
		if (c > a && c > b)
			max = c;
			
		return max;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.intMax(1, 2, 3));
		System.out.println(o.intMax(1, 3, 2));
		System.out.println(o.intMax(3, 2, 1));

	}
	
}

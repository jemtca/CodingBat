
public class warmup1 {

	// this function return the sum of the two given int values
	// if the two values are the same, return double their sum
	public int sumDouble (int a, int b) {
		
		int i = 0;
		
		if (a != b)
			i = a + b;
		else
			i = (a + b) * 2;
		
		return i;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.sumDouble(1, 2));
		System.out.println(o.sumDouble(3, 2));
		System.out.println(o.sumDouble(2, 2));

	}
	
}

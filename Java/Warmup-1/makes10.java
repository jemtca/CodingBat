
public class warmup1 {

	// this function return true if one of the two given int values is ten or their sum is ten
	public boolean makes10(int a, int b) {
		
		boolean bool = false;
		
		if (a == 10 || b == 10 || a + b == 10)
			bool = true;
			
		return bool;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.makes10(9, 10));
		System.out.println(o.makes10(9, 9));
		System.out.println(o.makes10(1, 9));

	}
	
}


public class warmup1 {

	// this function return true if the number given it is within 10 of 100 or 200
	public boolean nearHundred(int n) {
		
		return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10 ? true : false;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		boolean b;
		
		b = o.nearHundred(93);
		System.out.println(b);
		
		b = o.nearHundred(90);
		System.out.println(b);
		
		b = o.nearHundred(89);
		System.out.println(b);
		
	}
	
}


public class warmup1 {

	// this function return true if it is not weekday or we are on vacation
	public boolean sleepIn(boolean weekday, boolean vacation) {
		
		return !weekday || vacation ? true : false;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		boolean b;
		
		b = o.sleepIn(false, false);
		System.out.println(b);
		
		b = o.sleepIn(false, true);
		System.out.println(b);
		
		b = o.sleepIn(true, false);
		System.out.println(b);
		
		b = o.sleepIn(true, true);
		System.out.println(b);
		
	}
	
}

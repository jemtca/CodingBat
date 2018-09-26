
public class warmup1 {

	// this function return true (trouble) if a loud talking parrot is talking and it is before 7 or it is after 20
	public boolean parrotTrouble(boolean talking, int hour) {
		
		boolean b = false;

		if (talking && (hour < 7 || hour > 20))
			b = true;
			
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.parrotTrouble(true, 6));
		System.out.println(o.parrotTrouble(true, 7));
		System.out.println(o.parrotTrouble(false, 6));

	}
	
}

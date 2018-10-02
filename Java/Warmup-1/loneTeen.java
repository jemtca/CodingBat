
public class warmup1 {

	// this function return true if one of the two given numbers is "teen", but not both
	// teen = range 13..19 inclusive
	public boolean loneTeen(int a, int b) {
		
		boolean bool = false;
		
		if ((a >= 13 && a <= 19) && ( b >= 13 && b <= 19))
			bool = false;
		else if ((a >= 13 && a <= 19))
			bool = true;
		else if ( b >= 13 && b <= 19)
			bool = true;
		
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.loneTeen(13, 99));
		System.out.println(o.loneTeen(21, 19));
		System.out.println(o.loneTeen(13, 13));

	}
	
}

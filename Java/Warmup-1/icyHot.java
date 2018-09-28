
public class warmup1 {

	// this function return true if one of the two given temperatures is less than 0 and the other is greater than 100
	public boolean icyHot(int temp1, int temp2) {
		
		boolean b = false;
		
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100))
			b = true;
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.icyHot(120, -1));
		System.out.println(o.icyHot(-1, 120));
		System.out.println(o.icyHot(2, 120));

	}
	
}

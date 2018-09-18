
public class warmup1 {

	// this function return true if the given string begins with "mix", except the 'm' can be anything
	public boolean mixStart(String str) {
		
		boolean bool = false;
		
		if (str.length() >= 3 && str.charAt(1) == 'i' && str.charAt(2) == 'x')
			bool = true;
		
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.mixStart("mix snacks"));
		System.out.println(o.mixStart("pix snacks"));
		System.out.println(o.mixStart("piz snacks"));
		
	}
	
}

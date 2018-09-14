
public class warmup1 {

	// this function return true if the given string starts with "hi", false otherwise
	public boolean startHi(String str) {
		
		return str.startsWith("hi");
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.startHi("hi there"));
		System.out.println(o.startHi("hi"));
		System.out.println(o.startHi("hello hi"));
		
	}
	
}


public class warmup1 {

	// this function return a new string adding the last char at the front and at the back
	public String backAround(String str) {
		
		String s = "";
		
		if (str.length() >= 1) {
			s = str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
		}
		else
			System.out.println("Wrong input.");
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		String s;
		
		s = o.backAround("cat");
		System.out.println(s);
		
		s = o.backAround("Hello");
		System.out.println(s);
		
		System.out.println(o.backAround("a"));
		
	}
	
}

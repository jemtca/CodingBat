
public class warmup1 {

	// this function return the string made starting with char 0, and then every Nth char of the string
	public String everyNth(String str, int n) {
		
		String s = "";
		
		if (!str.isEmpty() && n >= 1) {
			int i = 0;
			while(i < str.length()) {
				s = s + str.charAt(i);
				i = i + n;
			}
		}
		else {
			System.out.println("Wrong input.");
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.everyNth("Miracle", 2));
		System.out.println(o.everyNth("abcdefg", 2));
		System.out.println(o.everyNth("abcdefg", 3));
		
	}
	
}

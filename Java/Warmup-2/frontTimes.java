
public class warmup2 {

	// this function return a string with n copies of the front
	// front = 3 first chars of the given string
	public String frontTimes(String str, int n) {
	
		String s = "";

		for (int i = 0; i < n; i++) {
			if (str.length() > 2)
				s = s + str.substring(0,3);
			else
				s = s + str;
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();

		System.out.println(o.frontTimes("Chocolate", 2));
		System.out.println(o.frontTimes("Chocolate", 3));
		System.out.println(o.frontTimes("Abc", 3));

	}

}

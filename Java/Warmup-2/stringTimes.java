
public class warmup2 {

	// this function return a new string that is n copies of the given string
	// n is a non negative int value
	public String stringTimes(String str, int n) {
		
		String s = "";
		
		for (int i = 0; i < n; i++)
			s = s + str;
		
		return s;
		
	}
	
	public static void main(String[] args) {

		warmup2 o = new warmup2();
		
		System.out.println(o.stringTimes("Hi", 2));
		System.out.println(o.stringTimes("Hi", 3));
		System.out.println(o.stringTimes("Hi", 1));

	}

}

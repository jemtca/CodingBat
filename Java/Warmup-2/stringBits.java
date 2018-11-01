
public class warmup2 {

	// this function return a new string made of every other char starting with the first
	public String stringBits(String str) {
	
		String s = "";

		for (int i = 0; i < str.length(); i+=2)
			s = s + str.charAt(i);
		
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();

		System.out.println(o.stringBits("Hello"));
		System.out.println(o.stringBits("Hi"));
		System.out.println(o.stringBits("Heeololeo"));

	}

}

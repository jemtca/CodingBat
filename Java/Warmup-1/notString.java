
public class warmup1 {

	// this function return a new string where "not" is added to the front
	// if the string already begin with "not", the function return the string unchanged
	public String notString(String str) {

		String s = "";
		
		if (!str.startsWith("not"))
			s = "not " + str;
		else
			s = str;
		
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.notString("candy"));
		System.out.println(o.notString("x"));
		System.out.println(o.notString("not bad"));

	}
	
}

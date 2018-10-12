
public class warmup1 {

	// this function return a new string with the two first chars of the given string added at both the front and the back
	// if the string length is less than two, use whatever chars are there
	public String front22(String str) {

		String s = "";
		
		if (str.length() < 2)
			s = str + str + str;
		else
			s = str.substring(0, 2) + str + str.substring(0, 2);
		
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.front22("kitten"));
		System.out.println(o.front22("Ha"));
		System.out.println(o.front22("abc"));

	}
	
}

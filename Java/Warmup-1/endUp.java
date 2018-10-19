
public class warmup1 {

	// this function return a string where the last three chars are now in upper case
	// if the string has lees than 3 chars, uppercase whatever is there
	public String endUp(String str) {

		String s = "";

		if (str.length() < 3)
			s = str.toUpperCase();
		else {
			String last3 = str.substring(str.length() - 3).toUpperCase();
			s = str.substring(0, str.length() - 3) + last3;
		}
		
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.endUp("Hello"));
		System.out.println(o.endUp("hi there"));
		System.out.println(o.endUp("hii"));

	}
	
}

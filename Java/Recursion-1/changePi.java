
public class recursion1 {
	
	// given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14"
	public String changePi(String str) {
		
		String s = "";
		
		if (str.isEmpty()) {
			return s;
		}
		
		if (str.length() > 1 && str.substring(0, 2).equalsIgnoreCase("pi")) {
			return s + "3.14" + changePi(str.substring(2));
		}
		else {
			return s + str.charAt(0) + changePi(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.changePi("xpix"));
		System.out.println(o.changePi("pipi"));
		System.out.println(o.changePi("pip"));

	}

}

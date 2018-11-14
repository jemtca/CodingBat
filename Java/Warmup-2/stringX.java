
public class warmup2 {

	// this function return a new string where all the 'x' have been removed
	// if the given string starts or ends with 'x', the 'x' should not be removed
	public String stringX(String str) {
				
		String s = "";
		String temp = "";
		
		if (str.length() > 1) {
			temp = str.substring(1, str.length()-1);
			s = temp.replaceAll("x", "");
			s = str.charAt(0) + s + str.charAt(str.length()-1);
		}
		else
			s = str;
		
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		System.out.println(o.stringX("xxHxix"));
		System.out.println(o.stringX("abxxxcd"));
		System.out.println(o.stringX("xabxxxcdx"));

	}

}

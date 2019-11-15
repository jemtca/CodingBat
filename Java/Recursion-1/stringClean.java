
public class recursion1 {
	
	// given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char
	// so "yyzzza" yields "yza"
	public String stringClean(String str) {
		
		if (str.length() == 0) {
			return "";
		}
		
		if (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
			return stringClean(str.substring(1));
		}
		else {
			return str.charAt(0) + stringClean(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.stringClean("yyzzza"));
		System.out.println(o.stringClean("abbbcdd"));
		System.out.println(o.stringClean("Hello"));
		
	}

}
